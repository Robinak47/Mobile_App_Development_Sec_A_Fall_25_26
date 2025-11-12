package com.example.toggle_button

import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var textBox: TextView
        lateinit var image: ImageView
        lateinit var tgBtn: ToggleButton
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image=findViewById<ImageView>(R.id.img)
        textBox=findViewById<TextView>(R.id.txt)
        tgBtn=findViewById<ToggleButton>(R.id.tg)

        tgBtn.setOnCheckedChangeListener { CompoundButton, isChecked ->
            if(isChecked)
            {
                image.setImageResource(R.drawable.samsung)
                textBox.text="Image is Invisible"
            }

            else
            {
                image.visibility= View.VISIBLE
                textBox.text="Image is visible"
            }
        }




    }
}