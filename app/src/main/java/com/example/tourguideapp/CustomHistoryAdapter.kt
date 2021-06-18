package com.example.tourguideapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import java.util.zip.Inflater

class CustomHistoryAdapter(private var mcontext: Context, private var resource: Int, private var listofimages:List<HistoryCustomAdapterImage>): ArrayAdapter<HistoryCustomAdapterImage>(mcontext,resource,listofimages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val enflator:LayoutInflater = LayoutInflater.from(mcontext)
        val HisImagesView:View = enflator.inflate(resource,null)

        val position = listofimages[position]
        val imageIds:ImageView = HisImagesView.findViewById(R.id.historyImages)

        imageIds.setImageResource(position.HistoryImages)

        return HisImagesView

    }
}