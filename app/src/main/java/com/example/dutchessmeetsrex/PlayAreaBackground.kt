package com.example.dutchessmeetsrex

import android.content.ClipData
import android.content.ClipDescription
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color.*
import android.graphics.Point
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.*
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import androidx.core.view.marginTop


class PlayAreaBackground: AppCompatActivity(), OnTouchListener {
    private var dX : Float = 0.0f
    private var dY : Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.play_area_background)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        val card = findViewById<ImageView>(R.id.play_card)
        card.setOnTouchListener(this)
    }

    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        when(motionEvent.action) {
            MotionEvent.ACTION_DOWN -> {
                dX = view.x - motionEvent.rawX
                dY = view.y - motionEvent.rawY
            }
            MotionEvent.ACTION_MOVE -> {
                view.animate()
                    .x(motionEvent.rawX + dX)
                    .y(motionEvent.rawY + dY)
                    .setDuration(0)
                    .start()


            }
            MotionEvent.ACTION_UP -> {

               /*  If I wanted to animate it back to the original position.
               view.animate()
                    .x(view.left.toFloat())
                    .y(view.top.toFloat())
                    .setDuration(250)
                    .start()*/
            }
            else -> {
                return false
            }
        }
        return true
    }
}





