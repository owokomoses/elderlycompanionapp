package com.owoko.elderlycompanioncareapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var Txt_gotoregister:TextView
    lateinit var edtloginemail:TextInputEditText
    lateinit var edtloginpassword:TextInputEditText
    lateinit var btnlogin:Button
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotoregister = findViewById(R.id.textView2)
        edtloginemail = findViewById(R.id.layout_name)
        edtloginpassword = findViewById(R.id.layout_password)
        btnlogin = findViewById(R.id.btn_signin)
        auth = FirebaseAuth.getInstance()


        Txt_gotoregister.setOnClickListener {
            val intent = Intent(this,signupActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            login()
        }
    }
    private fun login(){
        val email=edtloginemail.text.toString()
        val pass= edtloginpassword.text.toString()
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                val intent =Intent(this,HomeActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Successfully Logged in",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
            }
        }
    }
}
