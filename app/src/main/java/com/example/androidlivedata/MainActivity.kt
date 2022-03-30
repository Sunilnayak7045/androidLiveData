package com.example.androidlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel_var: mainViewModel
    private  val Textview_var: TextView
        get() =  findViewById(R.id.textView)

    private  val btn_var: Button
        get() =  findViewById(R.id.updatebtn)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel_var = ViewModelProvider(this).get(mainViewModel::class.java)
        mainViewModel_var.factsLiveData.observe(this, Observer {

        // Whenever there is change in livedata this block of code will execute

            Textview_var.text= it

        })
        btn_var.setOnClickListener {
            mainViewModel_var.updateLiveData()
        }

    }
}