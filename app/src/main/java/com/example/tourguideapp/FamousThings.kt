package com.example.tourguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamousThings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_famous_things)

        val arrayOfFamousThings = ArrayList<CustomPlaces>()

        arrayOfFamousThings.add(CustomPlaces("Betel Nut’s Toys",R.drawable.betulnut))



        val famousThingsListView = findViewById<ListView>(R.id.famousThingsListView)


        famousThingsListView.adapter = CustomAdapter(this,R.layout.custom_layout_for_all,arrayOfFamousThings)
    }
}