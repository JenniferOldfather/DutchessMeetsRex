package com.example.dutchessmeetsrex

import java.util.*

//List of Cards or it can be empty
//has an empty image
//If there are cards in the deck, typically there is a pile that the deck feeds one or three cards to at a time, that is the deck's upcards - not correct terminology.
//Deck should be shuffled after the cards are populated in the deck but before game play.  This can happen outside of the class during the game setup.
//The Deck can be staggered but most of the time it is not.
//The Deck is never face up.  Only the Deck's upcards are face up.
//The Game determines how many times a player can go back through a deck.  Most games are unlimited, 1, or 3.  Based on the game's difficulty will determine how many passes through the deck a player has.

open class Deck() {

    var cards:MutableList<Card>? = null
    var size: Int? = null
    var isStaggered: Boolean? = null
    var passesThroughDeck: Int? = null

    constructor(_cards: MutableList<Card>, _size : Int, _isStaggered: Boolean, _passesThroughDeck: Int): this(){
        this.cards = _cards
        this.size = _size
        this.isStaggered = _isStaggered
        this.passesThroughDeck = _passesThroughDeck
    }

}
