package com.example.dutchessmeetsrex

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


private const val TAG = "LevelActivity"


class LevelFragment : Fragment() {
    private lateinit var playButton: Button
    private lateinit var level: Level
    private lateinit var gameEntry: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        level = Level()

        }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.layout_level_fragment, container, false)
        gameEntry = view.findViewById(R.id.game_entry) as Button

        gameEntry.setOnClickListener { view: View ->
            val activity = view.context as AppCompatActivity
            val myFragment: Fragment = GameFragment()
            activity.supportFragmentManager.beginTransaction()
                .replace(R.layout.layout_game_fragment, myFragment)
                .addToBackStack(null)
                .commit()
            activity.
            //(R.drawable.play_area_background)
        }

        return view

    }
}
