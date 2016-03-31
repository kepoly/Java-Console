/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author kepoly
 */
public class Hand {

    public String name;
    public Deque hand;

    Hand(String inName, Deque inHand) {
        this.name = inName;
        this.hand = inHand;
    }

    public Deque returnHandArray(Boolean player) {
        Iterator handz = this.hand.descendingIterator();
        Deque handreturn = new ArrayDeque<>();
        int count = 0;
        if (player) {
           while(handz.hasNext() && count == 0) {
               handreturn.add(handz.next());
               count++;
           }
        }
       
        
           return handreturn;
    }
    
    /*
    *The tester page has the right way to handle this.
    */
    public void takeCardFromDeck(Deque inDeck, int inAmount) {
        
        Object returnDeck = inDeck.getFirst();
        
        for(int i = 0; i < inAmount; i++) {
            this.hand.add(returnDeck);
            inDeck.removeFirst();
        }
    }

    @Override
    public String toString() {
        return "Hand{" + "name=" + name + ", hand=" + hand + '}';
    }
    
    

}
