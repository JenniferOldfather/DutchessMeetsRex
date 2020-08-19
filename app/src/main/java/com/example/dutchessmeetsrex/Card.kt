package com.example.dutchessmeetsrex

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable
import android.security.identity.CipherSuiteNotSupportedException
import java.util.*

const val ACE = 1
const val KING = 13
const val QUEEN = 12
const val JACK = 11
const val DIAMOND = 0
const val HEART = 2
const val SPADE = 3
const val CLUB = 4
var FACE_UP = false
var LOCKED = false

//has a rank
//has a suit
//is Face_up or Face_down

open class Card(_rank: Int, _suit: Int){
    constructor(_rank: Int, _suit: Int, _isFaceUp : Boolean, _isLocked : Boolean) : this(_rank, _suit)

    var rank = _rank
    var suit = _suit

    var setImage = images(rank, suit)

    private fun images(rank: Int, suit: Int): Any {
        if (rank == ACE && suit == HEART){ return R.drawable.ace_of_hearts60x90
        }else if(rank == KING && suit == HEART){return R.drawable.king_of_hearts60x90
        }else if(rank == QUEEN && suit == HEART){return R.drawable.queen_of_hearts60x90
        }else if(rank == JACK && suit == HEART){return R.drawable.jack_of_hearts60x90
        }else if(rank == 10 && suit == HEART){return R.drawable.ten_of_hearts60x90
        }else if(rank == 9 && suit == HEART){return R.drawable.nine_of_hearts60x90
        }else if(rank == 8 && suit == HEART){return R.drawable.eight_of_hearts60x90
        }else if(rank == 7 && suit == HEART){return R.drawable.seven_of_hearts60x90
        }else if(rank == 6 && suit == HEART){return R.drawable.six_of_hearts60x90
        }else if(rank == 5 && suit == HEART){return R.drawable.five_of_hearts60x90
        }else if(rank == 4 && suit == HEART){return R.drawable.four_of_hearts60x90
        }else if(rank == 3 && suit == HEART){return R.drawable.three_of_hearts60x90
        }else if(rank == 2 && suit == HEART){return R.drawable.two_of_hearts60x90
        }else if(rank == ACE && suit == DIAMOND){ return R.drawable.ace_of_diamonds60x90
        }else if(rank == KING && suit == DIAMOND){ return R.drawable.king_of_diamonds60x90
        }else if(rank == QUEEN && suit == DIAMOND){ return R.drawable.queen_of_diamonds60x90
        }else if(rank == JACK && suit == DIAMOND){ return R.drawable.jack_of_diamonds60x90
        }else if(rank == 10 && suit == DIAMOND){ return R.drawable.ten_of_diamonds60x90
        }else if(rank == 9 && suit == DIAMOND){ return R.drawable.nine_of_diamonds60x90
        }else if(rank == 8 && suit == DIAMOND){ return R.drawable.eight_of_diamonds60x90
        }else if(rank == 7 && suit == DIAMOND){ return R.drawable.seven_of_diamonds60x90
        }else if(rank == 6 && suit == DIAMOND){ return R.drawable.six_of_diamonds60x90
        }else if(rank == 5 && suit == DIAMOND){ return R.drawable.five_of_diamonds60x90
        }else if(rank == 4 && suit == DIAMOND){ return R.drawable.four_of_diamonds60x90
        }else if(rank == 3 && suit == DIAMOND){ return R.drawable.three_of_diamonds60x90
        }else if(rank == 2 && suit == DIAMOND){ return R.drawable.two_of_diamonds60x90
        }else if(rank == ACE && suit == SPADE){ return R.drawable.ace_of_spades60x90
        }else if(rank == KING && suit == SPADE){ return R.drawable.king_of_spades60x90
        }else if(rank == QUEEN && suit == SPADE){ return R.drawable.queen_of_spades60x90
        }else if(rank == JACK && suit == SPADE){ return R.drawable.jack_of_spades60x90
        }else if(rank == 10 && suit == SPADE){ return R.drawable.ten_of_spades60x90
        }else if(rank == 9 && suit == SPADE){ return R.drawable.nine_of_spades60x90
        }else if(rank == 8 && suit == SPADE){ return R.drawable.eight_of_spades60x90
        }else if(rank == 7 && suit == SPADE){ return R.drawable.seven_of_spades60x90
        }else if(rank == 6 && suit == SPADE){ return R.drawable.six_of_spades60x90
        }else if(rank == 5 && suit == SPADE){ return R.drawable.five_of_spades60x90
        }else if(rank == 4 && suit == SPADE){ return R.drawable.four_of_spades60x90
        }else if(rank == 3 && suit == SPADE){ return R.drawable.three_of_spades60x90
        }else if(rank == 2 && suit == SPADE){ return R.drawable.two_of_spades60x90
        }else if(rank == ACE && suit == CLUB){ return R.drawable.ace_of_clubs60x90
        }else if(rank == KING && suit == CLUB){ return R.drawable.king_of_clubs60x90
        }else if(rank == QUEEN && suit == CLUB){ return R.drawable.queen_of_clubs60x90
        }else if(rank == JACK && suit == CLUB){ return R.drawable.jack_of_clubs60x90
        }else if(rank == 10 && suit == CLUB){ return R.drawable.ten_of_clubs60x90
        }else if(rank == 9 && suit == CLUB){ return R.drawable.nine_of_clubs60x90
        }else if(rank == 8 && suit == CLUB){ return R.drawable.eight_of_clubs60x90
        }else if(rank == 7 && suit == CLUB){ return R.drawable.seven_of_clubs60x90
        }else if(rank == 6 && suit == CLUB){ return R.drawable.six_of_clubs60x90
        }else if(rank == 5 && suit == CLUB){ return R.drawable.five_of_clubs60x90
        }else if(rank == 4 && suit == CLUB){ return R.drawable.four_of_clubs60x90
        }else if(rank == 3 && suit == CLUB){ return R.drawable.three_of_clubs60x90
        }else if(rank == 2 && suit == CLUB){ return R.drawable.two_of_clubs60x90
        } else  {
            return R.drawable.joker60x90
        }
        return R.drawable.joker60x90
    }


}


