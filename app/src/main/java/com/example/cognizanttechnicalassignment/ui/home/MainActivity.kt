package com.example.cognizanttechnicalassignment.ui.home

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cognizanttechnicalassignment.R


class MainActivity : AppCompatActivity() {

    // Array of strings...
    var avengersArray = arrayOf(
        "Captain America", "Iron Man", "Hulk", "Black Widow",
        "Thor", "Spider Man", "Thanos", "Dr.Strange"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter<String>(this, R.layout.avengers_listview, avengersArray)
        val listView: ListView = findViewById<View>(R.id.list_view) as ListView
        listView.adapter = adapter
    }
}