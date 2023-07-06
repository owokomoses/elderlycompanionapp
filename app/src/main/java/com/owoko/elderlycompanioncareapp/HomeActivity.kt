package com.owoko.elderlycompanioncareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var labtest: ImageView
    lateinit var logout:ImageView
    lateinit var medicine:ImageView
    lateinit var doctor:ImageView
    lateinit var order:ImageView
    lateinit var articles:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        labtest = findViewById(R.id.lab_test)
        logout = findViewById(R.id.logout)
        medicine=findViewById(R.id.medicine)
        doctor=findViewById(R.id.find_doctor)
        order=findViewById(R.id.order_details)
        articles=findViewById(R.id.health_articles)

        labtest.setOnClickListener {
            val intent = Intent(this, LabtestActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        medicine.setOnClickListener{
            val intent =Intent(this,MedicineActivity::class.java)
            startActivity(intent)
        }
        doctor.setOnClickListener{
            val intent=Intent(this,DoctorActivity::class.java)
            startActivity(intent)
        }
        order.setOnClickListener{
            val intent=Intent(this,orderActivity::class.java)
            startActivity(intent)
        }
        articles.setOnClickListener{
            val intent=Intent(this,ArticlesActivity::class.java)
            startActivity(intent)
        }

    }
}