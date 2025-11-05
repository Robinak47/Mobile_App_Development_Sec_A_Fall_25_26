package com.example.uidesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

         lateinit var nameData: EditText
         lateinit var submitBtn: Button
         lateinit var result: TextView
         lateinit var pass: EditText
         lateinit var email: EditText
         lateinit var banglaCB: CheckBox
         lateinit var englishCB: CheckBox
         lateinit var maleRB: RadioButton
        lateinit var femaleRB: RadioButton
        lateinit var nextBtn:Button


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nameData=findViewById<EditText>(R.id.name)
        submitBtn=findViewById<Button>(R.id.submitBtn)
        result=findViewById<TextView>(R.id.resultTV)
        pass=findViewById<EditText>(R.id.pass)
        email=findViewById<EditText>(R.id.email)
        banglaCB=findViewById<CheckBox>(R.id.banglaCB)
        englishCB=findViewById<CheckBox>(R.id.englishCB)
        maleRB=findViewById<RadioButton>(R.id.maleRB)
        femaleRB=findViewById<RadioButton>(R.id.femaleRB)
        nextBtn=findViewById<Button>(R.id.button3)


        submitBtn.setOnClickListener {
            var data:String=nameData.text.toString()
            data=data+", "+pass.text.toString()+", "+email.text+", "

            if(banglaCB.isChecked)
            {
                var langulage:String="Bangla"
                data=data+", "+langulage
            }

            if(englishCB.isChecked)
            {
                var langulage:String="English"
                data=data+", "+langulage
            }


            if(maleRB.isChecked)
            {
                var gender:String="Male"
                data=data+", "+gender
            }

            else
            {
                var gender:String="Female"
                data=data+", "+gender

            }


            result.text=data
        }


        nextBtn.setOnClickListener {

            val intent= Intent(this, SecondAcivity::class.java)
            startActivity(intent)
        }


    }
}
