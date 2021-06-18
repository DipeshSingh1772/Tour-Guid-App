package com.example.tourguideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        historyView.setOnClickListener {
            val intent = Intent(this,HistoryOfRewa::class.java)
            startActivity(intent)
        }

        TouristView.setOnClickListener {
            val intent = Intent(this,TouristPlaces::class.java)
            startActivity(intent)
        }

        EventView.setOnClickListener {
            val intent = Intent(this,Events::class.java)
            startActivity(intent)
        }

        FamousView.setOnClickListener {
            val intent = Intent(this,FamousThings::class.java)
            startActivity(intent)
        }

    }
}