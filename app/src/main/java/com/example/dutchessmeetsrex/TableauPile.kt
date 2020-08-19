package com.example.dutchessmeetsrex

//Has an empty image
//Can build up or down
//Can build up or down by the same color, opposite colors, any other suit but the one assigned to the pile  - Many options - This might become a rule versus a part of the constructor.
//Most of the time, they only build down to 13 cards, but they can take more than 13.
//If the pile is locked, typically the cards are face down except for the bottom card.  However, depending on the rules, this can change.
//If the pile is unlocked, typically the cards in the Tableau Pile are all face up.
//Some games allow more than one card to be shown but they can still be locked, some games you can only pick the last couple of cards to build on
// or pull from so we will need to be flexible in how the game handles locking and unlocking, which cards are face up, what can be built on etc.
class TableauPile(_cards: MutableList<Card>, _size: Int, _isLocked: Boolean, _isStaggered : Boolean, _bottomCardFaceUp: Boolean, _buildUpOrDown: Int, _sameColor: Int) : Pile(_cards, _size,
    _isLocked, _isStaggered, _bottomCardFaceUp) {


}