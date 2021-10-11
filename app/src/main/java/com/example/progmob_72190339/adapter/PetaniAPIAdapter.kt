package com.example.progmob_72190339.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.R
import com.example.progmob_72190339.model.DataItem

class PetaniAPIAdapter(val petaniApi: List<DataItem>?): RecyclerView.Adapter<PetaniAPIAdapter.PetaniAPIHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniAPIAdapter.PetaniAPIHolder {
        return PetaniAPIHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_petaniapi, parent, false))
    }

    override fun onBindViewHolder(holder: PetaniAPIAdapter.PetaniAPIHolder, position: Int) {
        holder.bindUsers(petaniApi?.get(position))
    }

    override fun getItemCount(): Int {
        return petaniApi?.size ?: 0
    }

    class PetaniAPIHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNamapAPI: TextView
        lateinit var txtJumpAPI: TextView
        lateinit var txtAlamatpAPI : TextView
        lateinit var txtkabpAPI : TextView
        fun bindUsers(petaniApi: DataItem?) {
            itemView.apply {
                txtNamapAPI = findViewById(R.id.namapApi)
                txtJumpAPI = findViewById(R.id.jumpApi)
                txtAlamatpAPI = findViewById(R.id.alamatpApi)
                txtkabpAPI = findViewById(R.id.kabpApi)
                txtNamapAPI.text = petaniApi?.nama
                txtJumpAPI.text = petaniApi?.jumlahLahan
                txtAlamatpAPI.text = petaniApi?.alamat
                txtkabpAPI.text = petaniApi?.kabupaten
            }
        }
    }
}