package com.owoko.elderlycompanioncareapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class LabtestActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mylistview=findViewById<ListView>(R.id.mylistview)
        var list= mutableListOf<Model>()

        list.add(Model("Malaria","To establish and prevent malaria disease ",R.drawable.malaria))
        list.add(Model("cancer","To characterise development of abnormal cells",R.drawable.cancer))
        list.add(Model("High blood pressure","To see if the pressure in the blood vessels is too high",R.drawable.bloodpressure))
        list.add(Model("Diabetes","To check blood sugar",R.drawable.diabetes))


        mylistview.adapter=MyAdapter(this,R.layout.row,list)
    }
}