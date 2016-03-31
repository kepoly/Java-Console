/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author kepoly
 */
public class Deck {
    
    private Deque<Card> clubs = new ArrayDeque<>();
    private Deque<Card> diamonds = new ArrayDeque<>();
    private Deque<Card> hearts = new ArrayDeque<>();
    private Deque<Card> spades = new ArrayDeque<>();
    
    Deck() {
        this.clubs = new Suit("Clubs").buildSuits();
        this.diamonds = new Suit("Diamonds").buildSuits();
        this.hearts = new Suit("Hearts").buildSuits();
        this.spades = new Suit("Spades").buildSuits();
    }

    
    public Deque getNewDeck() {
        Deque<Card> deck = new ArrayDeque<>();
        deck.addAll(clubs);
        deck.addAll(diamonds);
        deck.addAll(hearts);
        deck.addAll(spades);
        return deck;
    }
    
}


