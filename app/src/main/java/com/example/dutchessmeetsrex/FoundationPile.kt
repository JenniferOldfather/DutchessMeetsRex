package com.example.dutchessmeetsrex

import com.example.dutchessmeetsrex.Card
import com.example.dutchessmeetsrex.Pile

//has an empty image
//starts with a specific card to start building on.
//It can build based on color, rank up or down,
//Can hold a specific # of cards.
//most of the time a foundation pile is condensed and not staggered but it can happen.
//the foundation pile is where the scoring happens.  As scoring becomes more sophisticated, it could be based on other properties.

open class FoundationPile() : Pile() {

    var score: Int? = null
    var foundationStartingCard: Int? = null
    var rankUpOrDown : Int? = null
    var sameColor: Boolean? = null

    constructor(_score: Int,_foundationStartingCard: Int,_rankUpOrDown: Int,_sameColor: Boolean): this(){
        this.score = _score
        this.foundationStartingCard = _foundationStartingCard
        this.rankUpOrDown = _rankUpOrDown
        this.sameColor = _sameColor
    }

}