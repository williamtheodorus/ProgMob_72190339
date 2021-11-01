package com.example.progmob_72190339.adapter

import android.content.Context
import android.content.Intent
import android.icu.text.Transliterator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.R
import com.example.progmob_72190339.crud.UpdatePetaniActivity
import com.example.progmob_72190339.model.DataItem
import com.example.progmob_72190339.model.ResponseAddPetani
import com.example.progmob_72190339.model.ResponsePetani
import com.example.progmob_72190339.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponsePetaniAdapter(val petaniApi: List<DataItem>?): RecyclerView.Adapter<ResponsePetaniAdapter.PetaniAPIHolder>() {
    lateinit var mContext : Context
    lateinit var adapter : ResponsePetaniAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResponsePetaniAdapter.PetaniAPIHolder {
        return PetaniAPIHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_petani, parent, false))
    }

    override fun onBindViewHolder(holder: ResponsePetaniAdapter.PetaniAPIHolder, position: Int) {
        holder.bindUsers(petaniApi?.get(position))
        var popupMenu = PopupMenu(holder.itemView.context, holder.itemView)
        popupMenu.menu.add(Menu.NONE,0,0,"Edit")
        popupMenu.menu.add(Menu.NONE,1,1,"Delete")
        popupMenu.setOnMenuItemClickListener { menuItem ->
            val id = menuItem.itemId
            mContext = holder.itemView.context
            if (id==0){
                var bundle = Bundle()
                var idTmp = petaniApi?.get(position)?.id.toString()

                bundle.putString("idPetani", idTmp)
                var intent = Intent(mContext, UpdatePetaniActivity::class.java)
                intent.putExtras(bundle)
                mContext.startActivity(intent)
            }
            else if(id==1){
                var idTmp = petaniApi?.get(position)?.id.toString()
                NetworkConfig().getService()
                    .deletePetani()
                    .enqueue(object : Callback<ResponseAddPetani?>) {

                    }
            }
        }
    }

    override fun getItemCount(): Int {
        return petaniApi?.size ?: 0
    }

    class PetaniAPIHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNamapAPI: TextView
        lateinit var txtAlamatpAPI : TextView
        lateinit var txtNamaIAPI : TextView
        lateinit var txtJumpAPI: TextView
        fun bindUsers(petaniApi: DataItem?) {
            itemView.apply {
                txtNamapAPI = findViewById(R.id.namapApi)
                txtAlamatpAPI = findViewById(R.id.alamatpApi)
                txtNamaIAPI = findViewById(R.id.namaiApi)
                txtJumpAPI = findViewById(R.id.jumpApi)
                txtNamapAPI.text = petaniApi?.nama
                txtAlamatpAPI.text = petaniApi?.alamat
                txtNamaIAPI.text = petaniApi?.namaIstri
                txtJumpAPI.text = petaniApi?.jumlahLahan
            }
        }
    }
}