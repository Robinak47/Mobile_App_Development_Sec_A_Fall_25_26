package com.example.activity_to_activity_data_transfer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var nameTF: EditText
    lateinit var emailTF: EditText
    lateinit var phoneTF: EditText

    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nameTF=findViewById<EditText>(R.id.nameTF)
        emailTF=findViewById<EditText>(R.id.emailTF)
        phoneTF=findViewById<EditText>(R.id.phoneTF)
        btn=findViewById<Button>(R.id.btn)

        btn.setOnClickListener {

            var nameValue:String =  nameTF.text.toString()
            var emailValue: String = emailTF.text.toString()
            var phoneValue: String = phoneTF.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("nameValue", nameValue)
            intent.putExtra("emailValue", emailValue)
            intent.putExtra("phoneValue", phoneValue)
            intent.putExtra("age", 30)
            intent.putExtra("cgpa", 3.99F)

            var arr: Array<String> = arrayOf("apple", "mango", "banana")

            intent.putExtra("fruitArray", arr)

            startActivity(intent)



        }
    }
}