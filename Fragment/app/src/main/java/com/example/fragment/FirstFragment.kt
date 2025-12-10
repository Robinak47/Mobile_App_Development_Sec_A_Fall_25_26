package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("ShowActivity", "In the layout Creation")
        return inflater.inflate(R.layout.ourfragment, container, false )

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ShowActivity", "Fragment container Attached with the activity")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ShowActivity", "Fragment Created")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ShowActivity", "UI Created")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ShowActivity", "Fragment Visible")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ShowActivity", "Fragment not interactable")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ShowActivity", "Fragment is hidden")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ShowActivity", "Fragment Become interactable")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ShowActivity", "view Destroyed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ShowActivity", "fragment destroyed")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ShowActivity", "Fragment detached")
    }


}