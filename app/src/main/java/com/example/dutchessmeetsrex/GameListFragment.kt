package com.example.dutchessmeetsrex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class GameListFragment : Fragment() {

    private inner class GameHolder(view : View): RecyclerView.ViewHolder(view), View.OnClickListener{
        fun bind(game: Game){

        }
    }

    override fun onClick(v: View?){
        callbacks?.onGameSelected(game.id)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gameFragment, container, false)
    }


}