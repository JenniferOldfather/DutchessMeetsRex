package com.example.dutchessmeetsrex


//No Cards/List of Cards
//Size Limit
//Locked/Unlocked
//Empty or have up to 52 cards
//Face Down or Face up cards
//Stagger height or condensed height - This typically occurs in the landscape map, but I am not sure if it would be better placed in this class.
//has an empty image
//General terminology for any pile that may or may not contain cards.  This includes, upcard for the deck, foundation, tableau, reserve, etc.
//This pile should be generic to be able to handle a variety of possibilities based on game play.

open class Pile(){
    constructor(_cards: MutableList<Card>, _size : Int, _isLocked: Boolean, _isStaggered: Boolean) : this()
    constructor(_cards: MutableList<Card>, _size : Int, _isLocked: Boolean, _isStaggered: Boolean, _bottomCardFaceUp: Boolean) : this()



}

