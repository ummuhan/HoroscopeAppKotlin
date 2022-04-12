package com.ummuhanoksuz.horoscopeappkotlin

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ummuhanoksuz.horoscopeappkotlin.databinding.HoroscopeRowBinding

class HoroscopeAdapter(var horoscopeList:ArrayList<Horoscope>): RecyclerView.Adapter<HoroscopeAdapter.ViewHolder>() {

    class ViewHolder(val binding: HoroscopeRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=HoroscopeRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.horoscopeNameText.text=horoscopeList.get(position).name
    }

    override fun getItemCount(): Int {
        return horoscopeList.size
    }
}