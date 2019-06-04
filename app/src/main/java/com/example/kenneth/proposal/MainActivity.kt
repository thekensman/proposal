package com.example.kenneth.proposal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView2)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()
    }
}