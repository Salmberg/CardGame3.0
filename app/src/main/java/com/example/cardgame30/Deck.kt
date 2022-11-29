package com.example.cardgame30

import com.example.cardgame30.Deck.cards


object Deck {

    val cards = mutableListOf<Card>()
    lateinit var nextCard: Card
    lateinit var currentCard: Card


    init {
        createCards()
        cards.shuffle()
    }

    fun drawCard():Card {
        nextCard = cards.removeAt(0)
        currentCard= cards[0]

        return nextCard
    }

    fun newRound(){
        createCards()
        cards.shuffle()
    }

}

fun createCards(){

    cards.add(Card("Two of hearts", 2, R.drawable.two_of_hearts))
    cards.add(Card("Three of hearts", 3, R.drawable.three_of_hearts))
    cards.add(Card("Four of hearts", 4, R.drawable.four_of_hearts))
    cards.add(Card("Five of hearts", 5, R.drawable.five_of_hearts))
    cards.add(Card("Six of hearts", 6, R.drawable.six_of_hearts))
    cards.add(Card("Seven of hearts", 7, R.drawable.seven_of_hearts))
    cards.add(Card("Eight of hearts", 8, R.drawable.eight_of_hearts))
    cards.add(Card("Nine of hearts", 9, R.drawable.nine_of_hearts))
    cards.add(Card("Ten of hearts", 10, R.drawable.ten_of_hearts))
    cards.add(Card("Jack of hearts", 11, R.drawable.jack_of_hearts2))
    cards.add(Card("Queen of hearts", 12, R.drawable.queen_of_hearts2))
    cards.add(Card("King of hearts", 13, R.drawable.king_of_hearts2))
    cards.add(Card("Ace of hearts", 14, R.drawable.ace_of_hearts))

}





