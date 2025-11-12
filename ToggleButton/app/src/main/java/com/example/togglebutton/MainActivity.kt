package com.example.togglebutton

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var imageView: ImageView
        lateinit var tgButton: ToggleButton
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView=findViewById<ImageView>(R.id.imgView)
        tgButton=findViewById<ToggleButton>(R.id.tgBtn)

        tgButton.setOnCheckedChangeListener { CompoundButton, isChecked ->

            if(isChecked)
            {
                imageView.visibility= View.INVISIBLE
                Toast.makeText(this, "Toggle button's State Changed",Toast.LENGTH_SHORT).show()
            }

            else
            {
                imageView.visibility= View.VISIBLE
            }
        }
    }
}