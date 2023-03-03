package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    lateinit var ButtonReturn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        ButtonReturn = findViewById(R.id.buttonReturn)
        ButtonReturn.setOnClickListener{
            var intent : Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}