package com.example.progmob_72190339

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        lateinit var btnGA : Button

        btnGA = findViewById(R.id.btnGetAPI)

        btnGA.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent (this@ServiceActivity, GetAPIActivity::class.java)
            startActivity(intent)
        })
    }
}