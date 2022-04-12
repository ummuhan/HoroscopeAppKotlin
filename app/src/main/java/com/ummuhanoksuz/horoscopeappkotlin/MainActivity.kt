package com.ummuhanoksuz.horoscopeappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.Transformations.map
import com.ummuhanoksuz.horoscopeappkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var horoscopeArray:ArrayList<Horoscope>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        horoscopeArray= ArrayList()
        horoscopeCreate()

        var adapter=ArrayAdapter(
            applicationContext,
            android.R.layout.simple_list_item_1,
            horoscopeArray.map{Horoscope->Horoscope.name})
        binding.listView.adapter=adapter

        binding.listView.onItemClickListener= AdapterView.OnItemClickListener { adapterView, view, i, l ->
            var intent=Intent(MainActivity@this,HoroscopeDetail::class.java)
            intent.putExtra("Horoscope",horoscopeArray.get(i))
            startActivity(intent)
        }
    }

    fun horoscopeCreate(){
        var balik=Horoscope("Balik","Balik Burcu",R.drawable.balik)
        var kova=Horoscope("Kova","Kova Burcu",R.drawable.kova)
        var akrep=Horoscope("Akrep","Akrep Burcu",R.drawable.akrep)
        var aslan=Horoscope("Aslan","Aslan Burcu",R.drawable.aslan)
        var yengec=Horoscope("Yengec","Yengec Burcu",R.drawable.yengec)
        var terazi=Horoscope("Terazi","Terazi Burcu",R.drawable.terazi)
        var basak=Horoscope("Basak","Basak Burcu",R.drawable.basak)
        var oglak=Horoscope("Oğlak","Oğlak Burcu",R.drawable.oglak)
        var ikizler=Horoscope("İkizler","İkizler Burcu",R.drawable.ikizler)
        var yay=Horoscope("Yay","Yay Burcu",R.drawable.yay)
        var boga=Horoscope("Boğa","Boğa Burcu",R.drawable.boga)
        var koc=Horoscope("Koc","Koc Burcu",R.drawable.koc)

        horoscopeArray.add(koc)
        horoscopeArray.add(boga)
        horoscopeArray.add(ikizler)
        horoscopeArray.add(yengec)
        horoscopeArray.add(aslan)
        horoscopeArray.add(basak)
        horoscopeArray.add(terazi)
        horoscopeArray.add(akrep)
        horoscopeArray.add(yay)
        horoscopeArray.add(oglak)
        horoscopeArray.add(kova)
        horoscopeArray.add(balik)

    }
}
