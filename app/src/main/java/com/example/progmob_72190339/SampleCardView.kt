package com.example.progmob_72190339

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.adapter.PetaniAdapterCV
import com.example.progmob_72190339.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var rvCV : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        rvCV = findViewById(R.id.rvCardView)

        var listPetani = listOf(
            Petani(user = "WT", nama = "William Theodorus", jumlahLahan = "10",identifikasi = "20",tambahLahan = "10"),
            Petani(user = "WT2", nama = "William Theodorus", jumlahLahan = "20",identifikasi = "30",tambahLahan = "10"),
            Petani(user = "WT3", nama = "William Theodorus", jumlahLahan = "30",identifikasi = "40",tambahLahan = "10"),
            Petani(user = "WT4", nama = "William Theodorus", jumlahLahan = "40",identifikasi = "50",tambahLahan = "10"),
            Petani(user = "WT5", nama = "William Theodorus", jumlahLahan = "50",identifikasi = "60",tambahLahan = "10")
        )

        val petaniAdapterCV = PetaniAdapterCV(listPetani)

        rvCV.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniAdapterCV
        }
    }
}