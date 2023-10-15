package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_main2)




        binding.dtiresult.text = intent.getStringExtra("total")


    } // end of onCreate
    // ************************ end of onCreate method ************************

    fun homePage (view: View) {
        var intent3 = Intent (this, MainActivity::class.java)
        startActivity(intent3)
    } // end of homePage






}