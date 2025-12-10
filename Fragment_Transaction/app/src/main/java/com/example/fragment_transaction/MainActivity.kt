package com.example.fragment_transaction

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lateinit var btn: Button

        var firstFregmentManager: FragmentManager = supportFragmentManager
        var firstFragmentTransaction: FragmentTransaction = firstFregmentManager.beginTransaction()

        var firstFragment: FirstFragment= FirstFragment()
        firstFragmentTransaction.add(R.id.frame, firstFragment)
        firstFragmentTransaction.commit()

        btn= findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            var secondFragmentManager: FragmentManager = supportFragmentManager
            var secondFragmentTransaction: FragmentTransaction = secondFragmentManager.beginTransaction()
            var secondFragment : SecondFragment = SecondFragment()
            secondFragmentTransaction.replace(R.id.frame, secondFragment)
            secondFragmentTransaction.commit()
        }


    }
}