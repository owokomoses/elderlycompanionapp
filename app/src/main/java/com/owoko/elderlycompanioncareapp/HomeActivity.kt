package com.owoko.elderlycompanioncareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var labtest: ImageView
    lateinit var logout:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        labtest = findViewById(R.id.lab_test)
        logout = findViewById(R.id.logout)

        labtest.setOnClickListener {
            val intent = Intent(this, LabtestActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}