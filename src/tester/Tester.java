/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author kepoly
 */
public class Tester{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Suit finaldeck = new Suit("Hearts");
        Deque dfinal = finaldeck.buildSuits();
        
        Deck newdeck = new Deck();
        Deque ddeck = newdeck.getNewDeck();
        
        Deque dummy = new ArrayDeque<>();
        
        Hand player = new Hand("Player", dummy);
        player.takeCardFromDeck(ddeck, 1);
        
        Collection hh =  player.returnHandArray(Boolean.TRUE);

        Iterator iter = hh.iterator();
        Object first = iter.next();
      System.out.println(ddeck);
      System.out.println(first);
        
    }
    
}
