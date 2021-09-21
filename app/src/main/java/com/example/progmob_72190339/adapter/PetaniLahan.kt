package com.example.progmob_72190339.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.R
import com.example.progmob_72190339.model.Petani


class PetaniLahan(val petani: List<Petani>): RecyclerView.Adapter<PetaniLahan.PetaniLahanHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniLahan.PetaniLahanHolder {
        return PetaniLahanHolder(LayoutInflater.from(parent.context).inflate(R.layout.lp_petani,parent,false))
    }

    override fun onBindViewHolder(holder: PetaniLahan.PetaniLahanHolder, position: Int) {
        holder.bindPetani(petani[position])
    }

    override fun getItemCount(): Int {
        return petani.size
    }

    class PetaniLahanHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUP: TextView
        lateinit var txtNP: TextView
        lateinit var txtJLP: TextView
        lateinit var txtIP: TextView
        lateinit var txtTLP: TextView
        fun bindPetani(petani: Petani) {
            itemView.apply {
                txtUP= findViewById(R.id.txtUserP)
                txtNP = findViewById(R.id.txtNameP)
                txtJLP = findViewById(R.id.txtTotJumLahP)
                txtIP = findViewById(R.id.txtIdentifikasiP)
                txtTLP = findViewById(R.id.txtTambahLahanP)
                txtUP.text = petani.user
                txtNP.text = petani.nama
                txtJLP.text = petani.jumlahLahan
                txtIP.text = petani.identifikasi
                txtTLP.text = petani.tambahLahan
            }
        }
    }

}