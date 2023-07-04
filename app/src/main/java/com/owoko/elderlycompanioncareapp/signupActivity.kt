package com.owoko.elderlycompanioncareapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class signupActivity : AppCompatActivity() {
    lateinit var Txt_gotologin:TextView
    lateinit var edtemail:TextInputEditText
    lateinit var edtpass:TextInputEditText
    lateinit var Btnreg:Button
    lateinit var edtconfpass:TextInputEditText
     lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        Txt_gotologin = findViewById(R.id.textView2)
        edtemail = findViewById(R.id.layout_name2)
        edtpass = findViewById(R.id.layout_password2)
        edtconfpass = findViewById(R.id.layout_password3)
        Btnreg = findViewById(R.id.btn_signin)
        auth = Firebase.auth

        Txt_gotologin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        Btnreg.setOnClickListener {
            Signupuser()

        }
    }
    private fun Signupuser(){
        val email=edtemail.text.toString()
        val pass =edtpass.text.toString()
        val confirmpass=edtconfpass.text.toString()

        if (email.isBlank()||pass.isBlank()||confirmpass.isBlank()){
            Toast.makeText(this,"please password and email cant be blank", Toast.LENGTH_LONG).show()
        }else if(pass != confirmpass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Signed up successfully", Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,"Failed to create user", Toast.LENGTH_LONG).show()
            }

        }
    }

}