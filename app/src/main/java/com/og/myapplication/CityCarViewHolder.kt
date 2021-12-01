package com.og.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityCarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val brandTextView: TextView = itemView.findViewById(R.id.brand_text_view)
    private val comfortLevelTextView: TextView = itemView.findViewById(R.id.comfort_level_text_view)
    private val priceTextView: TextView = itemView.findViewById(R.id.price_text_view)


    fun bind(cityCar: Car.CityCar) {
        brandTextView.text = "Brand - ${cityCar.brand}"
        comfortLevelTextView.text = "Comfort lvl - ${cityCar.comfortLevel}"
        priceTextView.text = "${cityCar.price}$"
    }


}