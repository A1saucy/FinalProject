package com.example.finalproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityHelpBinding


class helpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_help)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    } // end of onCreate
    // ************************ end of onCreate method ************************
    fun back (view: View) {
        onBackPressed()
    }

}