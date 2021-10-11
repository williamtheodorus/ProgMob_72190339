package com.example.progmob_72190339

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob_72190339.adapter.PetaniAPIAdapter
import com.example.progmob_72190339.model.DataItem
import com.example.progmob_72190339.model.ResponsePetani
import com.example.progmob_72190339.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetPetaniActivity : AppCompatActivity() {
    lateinit var rvPet : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_petani)

        rvPet = findViewById(R.id.rvPetaniAPI)

        NetworkConfig().getService()
            .getPetaniAll()
            .enqueue(object : Callback<ResponsePetani?> {
                override fun onFailure(call: Call<ResponsePetani?>, t: Throwable) {
                    Toast.makeText(this@GetPetaniActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: Call<ResponsePetani?>,
                    response: Response<ResponsePetani?>
                ) {
                    rvPet.apply{
                        layoutManager = LinearLayoutManager(this@GetPetaniActivity)
                        adapter = PetaniAPIAdapter(response.body()?.data as List<DataItem>?)
                    }
                }
            })
    }
}