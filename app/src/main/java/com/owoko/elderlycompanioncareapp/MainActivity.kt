package com.owoko.elderlycompanioncareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var buttonsignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonsignup=findViewById(R.id.btn_signup)

        buttonsignup.setOnClickListener{
            val intent=Intent(this,signupActivity::class.java)
            startActivity(intent)
        }

        }

    }

