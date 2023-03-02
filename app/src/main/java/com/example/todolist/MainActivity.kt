package com.example.todolist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ListText:TextView
    lateinit var InputText:EditText
    lateinit var ButtonAdd:Button
    lateinit var ButtonDelete:Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     ListText = findViewById(R.id.ListText)
     InputText= findViewById(R.id.InputText)
     ButtonAdd= findViewById(R.id.buttonAdd)
     ButtonDelete= findViewById(R.id.buttonDelete)

        //Add task
    ButtonAdd.setOnClickListener{
        var Task = InputText.text
       // ListText.text = "$Task"
        var data = "$Task"
        var list = mutableListOf<String>()
        list.add(data)

    }
        //delete task
   // ButtonDelete.setOnClickListener{

    //}

    }

}