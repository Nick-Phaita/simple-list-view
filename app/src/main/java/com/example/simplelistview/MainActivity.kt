package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.Listview)

        val teams= arrayOf("Barcelona","Manchester United","Bayern Munich","Juventus","PSG","Ajax FC","Sporting Lisbon")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,teams)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,"You have selected "+teams[position],Toast.LENGTH_LONG).show()
        }
    }
}