package com.owoko.elderlycompanioncareapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var textsign: TextView
    lateinit var signinbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textsign = findViewById(R.id.text_signup)
        signinbtn=findViewById(R.id.btn_signin)

        textsign.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)


        }
        signinbtn.setOnClickListener {
            val intent=Intent (this,HomeActivity::class.java)
            startActivity(intent)
        }

    }
}

