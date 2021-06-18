package com.example.tourguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)


        val arrayofEvents = ArrayList<CustomPlaces>()

        arrayofEvents.add(CustomPlaces("Vindhya Mahotsava",R.drawable.vindhyamahotsav))
        arrayofEvents.add(CustomPlaces("Mahamrityunjaya Festival",R.drawable.mahamritunjay))
        arrayofEvents.add(CustomPlaces("Malmaas Festival",R.drawable.malmaas))

        val ListFormat = findViewById<ListView>(R.id.eventListView)

        ListFormat.adapter = CustomAdapter(this,R.layout.custom_layout_for_all,arrayofEvents)

    }
}