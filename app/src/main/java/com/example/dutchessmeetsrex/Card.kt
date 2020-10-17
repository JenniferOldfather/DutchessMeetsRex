package com.example.dutchessmeetsrex

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable
import android.security.identity.CipherSuiteNotSupportedException
import java.util.*

enum class Suit{
    DIAMOND, HEART, SPADE, CLUB
}

enum class Rank {
    ACE, KING, QUEEN, JACK, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
}


open class Card(){

    //Declaring / Creating
    var rank: Rank? = null
    var suit: Suit? = null
    var faceUp: Boolean = false
    var locked: Boolean = false


    constructor(rank: Rank, suit: Suit, faceUp : Boolean, locked : Boolean) : this(){
        this.suit = suit
        this.rank = rank
        this.faceUp = faceUp
        this.locked = locked
    }

    constructor(rank: Rank, suit: Suit) : this(){
        this.suit = suit
        this.rank = rank
    }

    fun setCardImage(): String { //replace String with Image
        var result = "nothing"

        if (rank == Rank.NINE && suit == Suit.HEART) {
            result = "We found a match"
        }
        else {
            result = "Nothing was found. try again"
        }

        return result
    }


        fun main() {
            val card1 = Card(
                Rank.NINE,
                Suit.HEART,
                true,
                true
            )
            println(card1.suit)
            println(card1.setCardImage())

            val card2 = Card(
                Rank.TWO,
                Suit.SPADE

            )
            println(card2.suit)
            println(card2.setCardImage())
        }

    //create functions names with actions so instead of just image, add what you want it to do..
    open fun displayImages(rank: Rank, suit: Suit) {
        //Case Statements would go faster than if(else if)  or break it down by suit and then by all the ranks

        when(Suit.HEART){
            Rank.ACE -> R.drawable.ace_of_hearts60x90
            Rank.KING -> R.drawable.king_of_hearts60x90
            Rank.QUEEN -> R.drawable.queen_of_hearts60x90
            Rank.JACK -> R.drawable.jack_of_hearts60x90
            Rank.TEN ->  R.drawable.ten_of_hearts60x90
            Rank.NINE -> R.drawable.nine_of_hearts60x90
            Rank.EIGHT -> R.drawable.eight_of_hearts60x90
            Rank.SEVEN ->R.drawable.seven_of_hearts60x90
            Rank.SIX -> R.drawable.six_of_hearts60x90
            Rank.FIVE -> R.drawable.five_of_hearts60x90
            Rank.FOUR -> R.drawable.four_of_hearts60x90
            Rank.THREE -> R.drawable.three_of_hearts60x90
            Rank.TWO ->R.drawable.two_of_hearts60x90
        }
        when(Suit.DIAMOND) {
            Rank.ACE -> R.drawable.ace_of_diamonds60x90
            Rank.KING -> R.drawable.king_of_diamonds60x90
            Rank.QUEEN -> R.drawable.queen_of_diamonds60x90
            Rank.JACK -> R.drawable.jack_of_diamonds60x90
            Rank.TEN -> R.drawable.ten_of_diamonds60x90
            Rank.NINE -> R.drawable.nine_of_diamonds60x90
            Rank.EIGHT -> R.drawable.eight_of_diamonds60x90
            Rank.SEVEN -> R.drawable.seven_of_diamonds60x90
            Rank.SIX -> R.drawable.six_of_diamonds60x90
            Rank.FIVE -> R.drawable.five_of_diamonds60x90
            Rank.FOUR ->  R.drawable.four_of_diamonds60x90
            Rank.THREE -> R.drawable.three_of_diamonds60x90
            Rank.TWO -> R.drawable.two_of_diamonds60x90
        }
        when(Suit.SPADE) {
            Rank.ACE -> R.drawable.ace_of_spades60x90
            Rank.KING -> R.drawable.king_of_spades60x90
            Rank.QUEEN -> R.drawable.queen_of_spades60x90
            Rank.JACK -> R.drawable.jack_of_spades60x90
            Rank.TEN -> R.drawable.ten_of_spades60x90
            Rank.NINE -> R.drawable.nine_of_spades60x90
            Rank.EIGHT -> R.drawable.eight_of_spades60x90
            Rank.SEVEN -> R.drawable.seven_of_spades60x90
            Rank.SIX -> R.drawable.six_of_spades60x90
            Rank.FIVE -> R.drawable.five_of_spades60x90
            Rank.FOUR -> R.drawable.four_of_spades60x90
            Rank.THREE -> R.drawable.three_of_spades60x90
            Rank.TWO -> R.drawable.two_of_spades60x90
        }
        when(Suit.CLUB){
            Rank.ACE -> R.drawable.ace_of_clubs60x90
            Rank.KING -> R.drawable.king_of_clubs60x90
            Rank.QUEEN -> R.drawable.queen_of_clubs60x90
            Rank.JACK -> R.drawable.jack_of_clubs60x90
            Rank.TEN ->  R.drawable.ten_of_clubs60x90
            Rank.NINE -> R.drawable.nine_of_clubs60x90
            Rank.EIGHT -> R.drawable.eight_of_clubs60x90
            Rank.SEVEN ->R.drawable.seven_of_clubs60x90
            Rank.SIX -> R.drawable.six_of_clubs60x90
            Rank.FIVE -> R.drawable.five_of_clubs60x90
            Rank.FOUR -> R.drawable.four_of_clubs60x90
            Rank.THREE -> R.drawable.three_of_clubs60x90
            Rank.TWO ->R.drawable.two_of_clubs60x90
        }
        if(suit != Suit.CLUB || suit != Suit.SPADE || suit != Suit.DIAMOND || suit != Suit.HEART){
            R.drawable.joker60x90
        }




    }

    //create a face down method if face down return R.drawable.card_background


}


