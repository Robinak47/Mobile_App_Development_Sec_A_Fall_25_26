package com.example.activity_to_activity_data_transfer

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    lateinit var nameTB: TextView
    lateinit var emailTB: TextView
    lateinit var phoneNoTB:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nameTB=findViewById<TextView>(R.id.tb1)
        emailTB=findViewById<TextView>(R.id.tb2)
        phoneNoTB=findViewById<TextView>(R.id.tb3)

        nameTB.text= intent.getStringExtra("nameValue")+intent.getIntExtra("age", 0)
        emailTB.text= intent.getStringExtra("emailValue")+intent.getFloatExtra("cgpa", 0.0F)
        phoneNoTB.text=intent.getStringExtra("phoneValue")

        var fruitArray = intent.getStringArrayExtra("fruitArray")

        var fruit:String=""
        fruitArray?.forEach { i ->
            fruit=fruit+" "+i
        }

        phoneNoTB.text=phoneNoTB.text.toString()+fruit.toString()


    }
}