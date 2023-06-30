package com.owoko.elderlycompanioncareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var labtest: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        labtest = findViewById(R.id.lab_test)

        labtest.setOnClickListener {
            val intent = Intent(this, LabtestActivity::class.java)
            startActivity(intent)
        }
    }
}