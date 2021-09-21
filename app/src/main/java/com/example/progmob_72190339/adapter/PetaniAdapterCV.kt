package com.example.progmob_72190339.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.R
import com.example.progmob_72190339.model.Petani

class PetaniAdapterCV(val petani: List<Petani>): RecyclerView.Adapter<PetaniAdapterCV.PetaniHolderCV>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniAdapterCV.PetaniHolderCV {
        return PetaniHolderCV(LayoutInflater.from(parent.context).inflate(R.layout.cv_item_petani,parent,false))
    }

    override fun onBindViewHolder(holder: PetaniAdapterCV.PetaniHolderCV, position: Int) {
        holder.bindPetani(petani[position])
    }

    override fun getItemCount(): Int {
        return petani.size
    }

    class PetaniHolderCV(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUCV: TextView
        lateinit var txtNCV: TextView
        lateinit var txtJLCV: TextView
        lateinit var txtICV: TextView
        lateinit var txtTLCV: TextView
        fun bindPetani(petani: Petani) {
            itemView.apply {
                txtUCV= findViewById(R.id.txtUserCV)
                txtNCV = findViewById(R.id.txtNameCV)
                txtJLCV = findViewById(R.id.txtJumlahLahanCV)
                txtICV = findViewById(R.id.txtIdentifikasiCV)
                txtTLCV = findViewById(R.id.txtTambahLahanCV)
                txtUCV.text = petani.user
                txtNCV.text = petani.nama
                txtJLCV.text = petani.jumlahLahan
                txtICV.text = petani.identifikasi
                txtTLCV.text = petani.tambahLahan
            }
        }
    }

}



