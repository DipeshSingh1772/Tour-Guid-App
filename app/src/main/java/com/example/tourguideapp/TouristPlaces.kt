package com.example.tourguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class TouristPlaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourist_places)

        val arrayofTouristPlace = ArrayList<CustomPlaces>()

        arrayofTouristPlace.add(CustomPlaces("White Tiger Safari","Hitoric",R.drawable.whitetiger))
        arrayofTouristPlace.add(CustomPlaces("Deur Kothar","Historic",R.drawable.deorstupa))
        arrayofTouristPlace.add(CustomPlaces("Baghael Museum","Historic",R.drawable.museum))
        arrayofTouristPlace.add(CustomPlaces("Keoti WaterFall","Natural / Scenic beauty",R.drawable.keoti_waterfall))
        arrayofTouristPlace.add(CustomPlaces("Rewa Fort","Historic",R.drawable.rewafort))
        arrayofTouristPlace.add(CustomPlaces("Purwa WaterFall","Natural / Scenic beauty",R.drawable.purwafall))
        arrayofTouristPlace.add(CustomPlaces("Rani Talab","Natural / Scenic beauty",R.drawable.ranitalab))
        arrayofTouristPlace.add(CustomPlaces("Govindgarh Palace and Lake","Historic / Natural / Scenic beauty",R.drawable.govindgarh))
        arrayofTouristPlace.add(CustomPlaces("Bahuti WaterFall","Natural / Scenic beauty",R.drawable.bahutifalll))
        arrayofTouristPlace.add(CustomPlaces("Chachai Waterfall","Natural / Scenic beauty",R.drawable.chachaiwaterfall))


        val ListFormat = findViewById<ListView>(R.id.touristPlaceListView)

        ListFormat.adapter = CustomAdapter(this,R.layout.custom_layout_for_all,arrayofTouristPlace)

    }
}