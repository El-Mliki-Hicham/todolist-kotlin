package com.example.todolist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var ListData: ListView
    lateinit var InputText: EditText
    lateinit var ButtonAdd: Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListData = findViewById(R.id.ListData)
        InputText = findViewById(R.id.InputText)
        ButtonAdd = findViewById(R.id.buttonAdd)
        //list
       var array = mutableListOf<String>("hicham")
        //show list data in apk
        ListData.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array)
        //Button add task
        ButtonAdd.setOnClickListener {
            //input text
            var Task = InputText.text
            //test console
            println(Task)
            //add value to array
            array.add(Task.toString())
            //show list data in apk
            ListData.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array)
            InputText.setText("")
        }
        ListData.setOnItemClickListener { adapterView, view, postion, id ->
            var intent : Intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)

            //array.removeAt(postion)
            //Toast.makeText(this, "The task has been deleted", Toast.LENGTH_SHORT).show()
            //ListData.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
        }

    }

}