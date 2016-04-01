/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kepoly
 */
public class Hand {

    public String name;
    public List hand;

    Hand(String inName, List inHand) {
        this.name = inName;
        this.hand = inHand;
    }

    public List returnHandArray(Boolean player) {
        Iterator handz = this.hand.iterator();
        List handreturn = new ArrayList<>();
        int count = 0;
        if (player) {
           while(handz.hasNext()) {
               handreturn.add(handz.next());
               count++;
           }
        } else {
            while(handz.hasNext()) {
               handreturn.add(handz.next());
               count++;
           }
        }
           return handreturn;
    }
    
    /*
    *The tester page has the right way to handle this.
    */
    public void takeCardFromDeck(List inDeck, int inAmount) {
        
        Object returnDeck = inDeck.get(0);
        
        for(int i = 0; i < inAmount; i++) {
            this.hand.add(returnDeck);
            inDeck.remove(i);
        }
    }

    @Override
    public String toString() {
        return "Hand{" + "name=" + name + ", hand=" + hand + '}';
    }
    
    

}
