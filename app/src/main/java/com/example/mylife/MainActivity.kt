package com.example.mylife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }private fun addNickname(view: View){
        val editText=findViewById<EditText>(R.id.nickname_edit)

      
    }
}