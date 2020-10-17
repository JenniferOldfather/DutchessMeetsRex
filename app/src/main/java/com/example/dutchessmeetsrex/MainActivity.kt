package com.example.dutchessmeetsrex

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dutchessmeetsrex.R.*
import java.util.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var playButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        playButton = findViewById(id.playButton)
        playButton.setOnClickListener { view: View ->
            //create a new activity for the button
            val intent = Intent(this, LevelFragment::class.java)
            startActivity(intent)


        }
    }

}