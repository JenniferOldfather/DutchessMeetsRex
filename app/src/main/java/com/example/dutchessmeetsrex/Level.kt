package com.example.dutchessmeetsrex

import android.media.Image
import java.util.*

data class Level(
    val id: UUID = UUID.randomUUID(),
    val levelName: String = " ",
    val image: String = " ",
    var isRoomAvailable: Boolean = false,
    var fixesToBeMade: Set<Fixes> = setOf<Fixes>(),
    val story: String = " ",
    var isCompletionOfStory: Boolean = false,
    var prizeForCompletingRoom: Set<Prizes> = setOf<Prizes>()

)