package com.example.tourguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView

class HistoryOfRewa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_of_rewa)

        val arrayofhisimage = ArrayList<HistoryCustomAdapterImage>()

        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_1))
        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_2))
        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_3))
        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_4))
        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_5))
        arrayofhisimage.add(HistoryCustomAdapterImage(R.drawable.hphoto_7))


        val hisImageGridview = findViewById<ListView>(R.id.history_grid_view)

        hisImageGridview.adapter = CustomHistoryAdapter(this,R.layout.his_image_format,arrayofhisimage)

    }
}