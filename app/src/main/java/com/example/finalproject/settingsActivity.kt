package com.example.finalproject

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import com.example.finalproject.databinding.ActivitySettingsBinding

class settingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    private lateinit var modeSwitch: SwitchCompat
    private var nightMode:Boolean=false
    private var editor: SharedPreferences.Editor?=null
    private var sharedPreferences: SharedPreferences?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_settings)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // code for light/dark mode
        modeSwitch= findViewById(R.id.mode_switch)
        sharedPreferences= getSharedPreferences("MODE", Context.MODE_PRIVATE)
        nightMode= sharedPreferences?.getBoolean("night",false)!!

        if(nightMode) {
            modeSwitch.isChecked= true
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

        modeSwitch.setOnCheckedChangeListener { compoundButton, state ->

            if(nightMode){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                editor= sharedPreferences?.edit()
                editor?.putBoolean("night", false)
            }

            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                editor=sharedPreferences?.edit()
                editor?.putBoolean("night",true)
            }
            editor?.apply()


        } // end of code for light/dark mode

    } // end of onCreate
    // ************************ end of onCreate method ************************
    fun back (view: View) {
        onBackPressed()
    }

}