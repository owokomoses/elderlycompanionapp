package com.owoko.elderlycompanioncareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var text_sign: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_sign = findViewById(R.id.text_signup)

        text_sign.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)


        }

    }
}

