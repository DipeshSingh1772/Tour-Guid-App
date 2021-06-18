package com.example.tourguideapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var mcontext:Context,var resource:Int,var ListOfPlaces:List<CustomPlaces>):ArrayAdapter<CustomPlaces>(mcontext,resource,ListOfPlaces) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val enflater:LayoutInflater = LayoutInflater.from(mcontext)
        val itemXml = enflater.inflate(resource,null)

        val PlaceImage = itemXml.findViewById<ImageView>(R.id.Place_Image)
        val PlaceName = itemXml.findViewById<TextView>(R.id.Place_name)
        val PlaceCategory = itemXml.findViewById<TextView>(R.id.Place_Category)

        val item_position = ListOfPlaces[position]

        PlaceImage.setImageResource(item_position.Places_Images)
        PlaceName.text = item_position.Places_Name
        if(item_position.Place_Category == "null")
            PlaceCategory.visibility = View.GONE
        else
            PlaceCategory.text = item_position.Place_Category



        return itemXml
    }
}