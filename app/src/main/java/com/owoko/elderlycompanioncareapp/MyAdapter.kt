package com.owoko.elderlycompanioncareapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mctx: Context, var resourses:Int, var items:List<Model>):
    ArrayAdapter<Model>(mctx,resourses,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mctx)
        val view: View =layoutInflater.inflate(resourses,null)

        val imageView: ImageView =view.findViewById(R.id.imageView)
        val tittle: TextView =view.findViewById(R.id.Tv_Tittle)
        val descript: TextView =view.findViewById(R.id.Tv_sub)

        var mitems:Model=items[position]

        imageView.setImageDrawable(mctx.resources.getDrawable(mitems.img))
        tittle.text=mitems.tittle
        descript.text=mitems.Description

        return view

    }
}