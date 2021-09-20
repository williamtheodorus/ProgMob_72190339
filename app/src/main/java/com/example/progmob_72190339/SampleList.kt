package com.example.progmob_72190339

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        lateinit var btnList : Button

        btnList= findViewById(R.id.btnShowList)

        btnList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent (this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })
    }
}