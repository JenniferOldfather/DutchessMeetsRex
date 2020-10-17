package com.example.dutchessmeetsrex

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import java.util.*

private const val ARG_GAME_ID = "game_id"
private const val TAG = "GameFragment"

class GameFragment : Fragment(){

    private lateinit var game: Game
    private lateinit var solvedCheckBox: CheckBox
    private val gameDetailViewModel : GameDetailViewModel by lazy {
        ViewModelProviders.of(this).get(GameDetailViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        gameDetailViewModel.saveGame(game)
    }

 companion object {
     fun newInstance(gameId: UUID): GameFragment{
         val args = Bundle().apply{
             putSerializable(ARG_GAME_ID, gameId)
         }
         return GameFragment().apply {
             arguments = args
         }
     }
 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        game = Game()
        val gameId: UUID = arguments?.getSerializable(ARG_GAME_ID) as UUID
        gameDetailViewModel.loadGame(gameId)

        

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.layout_game_fragment, container, false)
        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gameDetailViewModel.gameLiveData.observe(
            viewLifecycleOwner, androidx.lifecycle.Observer { game ->
                game?.let {
                    this.game = game
                    updateUI()
                }}
        )
    }
    private fun updateUI(){
        titleField.setText(game.title)
        dateButton.text = game.date.toString()
        solvedCheckBox.apply{
            isChecked = game.isSolved
            jumpDrawablesToCurrentState()
        }
    }
}
