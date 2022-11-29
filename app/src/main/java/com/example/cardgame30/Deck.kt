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

    //Hearts
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

    //Spades
    cards.add(Card("Two of spades", 2, R.drawable.two_of_spades))
    cards.add(Card("Three of spades", 3, R.drawable.three_of_spades))
    cards.add(Card("Four of spades", 4, R.drawable.four_of_spades))
    cards.add(Card("Five of spades", 5, R.drawable.five_of_spades))
    cards.add(Card("Six of spades", 6, R.drawable.six_of_spades))
    cards.add(Card("Seven of spades", 7, R.drawable.seven_of_spades))
    cards.add(Card("Eight of spades", 8, R.drawable.eight_of_spades))
    cards.add(Card("Nine of spades", 9, R.drawable.nine_of_spades))
    cards.add(Card("Ten of spades", 10, R.drawable.ten_of_spades))
    cards.add(Card("Jack of spades", 11, R.drawable.jack_of_spades))
    cards.add(Card("Queen of spades", 12, R.drawable.queen_of_spades))
    cards.add(Card("King of spades", 13, R.drawable.king_of_spades))
    cards.add(Card("Ace of spades", 14, R.drawable.ace_of_spades))

    //Clubs
    cards.add(Card("Two of clubs", 2, R.drawable.two_of_clubs))
    cards.add(Card("Three of clubs", 3, R.drawable.three_of_clubs))
    cards.add(Card("Four of clubs", 4, R.drawable.four_of_clubs))
    cards.add(Card("Five of clubs", 5, R.drawable.five_of_clubs))
    cards.add(Card("Six of clubs", 6, R.drawable.six_of_clubs))
    cards.add(Card("Seven of clubs", 7, R.drawable.seven_of_clubs))
    cards.add(Card("Eight of clubs", 8, R.drawable.eight_of_clubs))
    cards.add(Card("Nine of clubs", 9, R.drawable.nine_of_clubs))
    cards.add(Card("Ten of clubs", 10, R.drawable.ten_of_clubs))
    cards.add(Card("Jack of clubs", 11, R.drawable.jack_of_clubs))
    cards.add(Card("Queen of clubs", 12, R.drawable.queen_of_clubs))
    cards.add(Card("King of clubs", 13, R.drawable.king_of_clubs))
    cards.add(Card("Ace of clubs", 14, R.drawable.ace_of_clubs))

    //Diamonds
    cards.add(Card("Two of diamonds", 2, R.drawable.two_of_diamonds))
    cards.add(Card("Three of diamonds", 3, R.drawable.three_of_diamonds))
    cards.add(Card("Four of diamonds", 4, R.drawable.four_of_diamonds))
    cards.add(Card("Five of diamonds", 5, R.drawable.five_of_diamonds))
    cards.add(Card("Six of diamonds", 6, R.drawable.six_of_diamonds))
    cards.add(Card("Seven of diamonds", 7, R.drawable.seven_of_diamonds))
    cards.add(Card("Eight of diamonds", 8, R.drawable.eight_of_diamonds))
    cards.add(Card("Nine of diamonds", 9, R.drawable.nine_of_diamonds))
    cards.add(Card("Ten of diamonds", 10, R.drawable.ten_of_diamonds))
    cards.add(Card("Jack of diamonds", 11, R.drawable.jack_of_diamonds))
    cards.add(Card("Queen of diamonds", 12, R.drawable.queen_of_diamonds))
    cards.add(Card("King of diamonds", 13, R.drawable.king_of_diamonds))
    cards.add(Card("Ace of diamonds", 14, R.drawable.ace_of_diamonds))

}





