package com.example.newproj

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    lateinit var tf1: EditText
    lateinit var btn1: Button

    lateinit var tb1: TextView

    var database: FirebaseDatabase= FirebaseDatabase.getInstance()
    var ref = database.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tf1 = findViewById<EditText>(R.id.tf2)
        btn1 = findViewById<Button>(R.id.btn1)
        tb1=findViewById<TextView>(R.id.tb1)

        btn1.setOnClickListener {

            var addres = tf1.text.toString()
            ref.child("user2").child("name").setValue(addres)

            ref.child("user2").addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    var name = snapshot.child("name").value
                    tb1.text = name.toString()
                }

                override fun onCancelled(error: DatabaseError) {
                    TODO("Not yet implemented")
                }
            }
                )

        }



    }
}