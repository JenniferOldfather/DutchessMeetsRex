package com.example.dutchessmeetsrex

import android.view.animation.Transformation
import androidx.lifecycle.*
import java.lang.reflect.Array.get
import java.util.*

class GameDetailViewModel() : ViewModel() {

    private val gameRepository = GameRepository.get()
    private val gameIDLiveData = MutableLiveData<UUID>()

    var gameLiveData : LiveData<Game?> =
        Transformations.switchMap(gameIDLiveData){
            gameId -> gameRepository.getGame(gameId)
        }

    fun loadGame(gameId: UUID){
        gameIDLiveData.value = gameId
    }

    fun saveGame(game: Game){
        gameRepository.updateGame(game)
    }
}