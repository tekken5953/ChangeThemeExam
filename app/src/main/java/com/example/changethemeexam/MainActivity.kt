package com.example.changethemeexam

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val darkBtn: Button = findViewById(R.id.changeDarkModeBtn)
        val lightBtn: Button = findViewById(R.id.changeLightModeBtn)
        val systemBtn: Button = findViewById(R.id.changeSystemModeBtn)

        darkBtn.setOnClickListener {
            changeTheme(AppCompatDelegate.MODE_NIGHT_YES)
        }

        lightBtn.setOnClickListener {
            changeTheme(AppCompatDelegate.MODE_NIGHT_NO)
        }

        systemBtn.setOnClickListener {
            changeTheme(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }
    }

    private fun changeTheme(mode: Int) {
        AppCompatDelegate.setDefaultNightMode(mode)
    }
}