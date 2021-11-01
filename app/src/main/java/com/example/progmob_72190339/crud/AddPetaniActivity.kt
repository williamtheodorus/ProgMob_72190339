package com.example.progmob_72190339.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.progmob_72190339.R
import com.example.progmob_72190339.SampleListView
import com.example.progmob_72190339.model.DataItem

class AddPetaniActivity : AppCompatActivity() {
    lateinit var edNama : EditText
    lateinit var edAlamat : EditText
    lateinit var edProvinsi : EditText
    lateinit var edKabupaten : EditText
    lateinit var edKecamatan : EditText
    lateinit var edKelurahan : EditText
    lateinit var edNamaIstri : EditText
    lateinit var edJumlahLahan : EditText
    lateinit var edFoto : EditText
    lateinit var btnSimpanPetani : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_petani)

        edNama = findViewById(R.id.edNama)
        edAlamat = findViewById(R.id.edAlamat)
        edProvinsi = findViewById(R.id.edProvinsi)
        edKabupaten = findViewById(R.id.edKabupaten)
        edKecamatan = findViewById(R.id.edKecamatan)
        edKelurahan = findViewById(R.id.edKelurahan)
        edNamaIstri = findViewById(R.id.edNamaIstri)
        edJumlahLahan = findViewById(R.id.edJumlahLahan)
        edFoto = findViewById(R.id.edFoto)
        btnSimpanPetani = findViewById(R.id.btnSimpanPetani)

        btnSimpanPetani.setOnClickListener(View.OnClickListener { view ->
            var ptn = DataItem()
            ptn.nama = edNama.text.toString()
            ptn.alamat = edAlamat.text.toString()
            ptn.provinsi = edProvinsi.text.toString()
            ptn.kabupaten = edKabupaten.text.toString()
            ptn.kecamatan = edKecamatan.text.toString()
            ptn.kelurahan = edKelurahan.text.toString()
            ptn.namaIstri = edNamaIstri.text.toString()
            ptn.jumlahLahan = edJumlahLahan.text.toString()
            ptn.foto = edFoto.text.toString()
            ptn.id = null

            var intent = Intent (this@AddPetaniActivity, GetPetaniActivity::class.java)
            startActivity(intent)
        })
    }
}