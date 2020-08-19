import com.example.dutchessmeetsrex.Card
import com.example.dutchessmeetsrex.Pile

//has an empty image
//starts with a specific card to start building on.
//It can build based on color, rank up or down,
//Can hold a specific # of cards.
//most of the time a foundation pile is condensed and not staggered but it can happen.
//the foundation pile is where the scoring happens.  As scoring becomes more sophisticated, it could be based on other properties.

class FoundationPile(
    _cards: MutableList<Card>,
    _size: Int,
    _isLocked: Boolean,
    _isStaggered: Boolean,
    _score: Int,
    _foundationStartingCard: Int,
    _rankUpOrDown: Int,
    _sameColor: Boolean

) : Pile(_cards, _size,
    _isLocked, _isStaggered) {

}