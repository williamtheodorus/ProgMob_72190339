package com.example.progmob_72190339

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.adapter.PetaniLahan
import com.example.progmob_72190339.model.Petani

class LahanPetani : AppCompatActivity() {
    lateinit var rvLP : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lahan_petani)

        rvLP = findViewById(R.id.rvLahanPetani)

        var listPetani = listOf(
            Petani(user = "abdulrohma", nama = "Abdul Rohman", jumlahLahan = "1",identifikasi = "0",tambahLahan = "1"),
            Petani(user = "abuwiyono", nama = "Abuwiyono / Sukri", jumlahLahan = "1",identifikasi = "1",tambahLahan = "0"),
            Petani(user = "adiprajitn", nama = "Adi Prajitno", jumlahLahan = "3",identifikasi = "0",tambahLahan = "3"),
            Petani(user = "adipranot2", nama = "Adi Pranoto", jumlahLahan = "3",identifikasi = "2",tambahLahan = "1")
        )

        val petaniLahan = PetaniLahan(listPetani)

        rvLP.apply{
            layoutManager = LinearLayoutManager(this@LahanPetani)
            adapter = petaniLahan
        }

    }
}