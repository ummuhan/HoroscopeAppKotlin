package com.ummuhanoksuz.horoscopeappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ummuhanoksuz.horoscopeappkotlin.databinding.ActivityHoroscopeDetailBinding

class HoroscopeDetail : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horoscope_detail)

        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var intent=intent

        //Casting
        var selectedHoroscope=intent.getSerializableExtra("Horoscope") as Horoscope

        binding.horoscopeName.text=selectedHoroscope.name
        binding.horoscopeDetail.text=selectedHoroscope.detail
        binding.horoscopeImage.setImageResource(selectedHoroscope.image!!)
    }
}