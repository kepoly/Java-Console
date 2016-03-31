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
public class Suit {

    private String suitName;
    
    public Suit(String inSuitName)
    {
        this.suitName = inSuitName;
    }
    
    public Deque buildSuits() {
        Deque<Card> cards = new ArrayDeque<>();
        for(int i = 0; i <= 9; i++) {
            String card = Integer.toString(i + 2);
            cards.add(new Card(card, this.suitName)); 
        }
        cards.add(new Card("J", this.suitName));
        cards.add(new Card("Q", this.suitName));
        cards.add(new Card("K", this.suitName));
        return cards;
    }

    @Override
    public String toString() {
        return "Suit{" + "suitName=" + suitName + '}';
    }
    
    
    
    
}
