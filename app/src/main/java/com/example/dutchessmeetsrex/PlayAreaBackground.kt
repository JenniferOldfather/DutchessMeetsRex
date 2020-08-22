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

/*This might need to be renamed.  This in my head would be the main class that holds the background
and any universal game functionality. Like OnTouch, Make Moves, determine level, the reference to the games, and mapping for the layout.
*/
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

    /*The creation of the Landscape map.
    Holds coordinates (X, Y) in reference to the view.
    Holds the designates the pile type, the number of cards expected.
    If the pile is to hold a specific card in the beginning, the map holds the Card's Suite and Rank to pull that card to be used.
    If the pile is locked at the beginning of the game, then it is noted here.
    If the pile is staggered, the x and y offset to stagger the piles.

    */

    fun gameLandscapeMap() : HashMap<Int, HashMap<Int, Int>> {
        return hashMapOf()
    }

    fun gameLayout(_number : Int, _xValue: Int, _yValue : Int, _pileType: Int, _numberOfCards: Int, _cardSuite : Int, _cardRank: Int, _isLocked: Boolean, _xOffset: Int, _yOffset: Int): HashMap<Int, Int> {
        val map = gameLandscapeMap()
        /*it should look like this...
        The first 0 is a reference for the first pile on the screen.
        The (1,0) are the x and y coordinates
        5 = number of cards the pile starts with
        0 - designated suite
        0 - designated rank
        0 - xOffset
        5 - yOffset
        map.put(0((1, 0), getTableauPile(), 5, 0,0,false, 0, 5)
        map.add(0)

        */

        return hashMapOf()
    }


}





