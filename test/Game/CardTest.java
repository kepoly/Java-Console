/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryner
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("Testing Card.getValue()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        
        Card instance = new Card(card, suit);
        String expResult = card;
        String result = instance.getValue();
        assertEquals(expResult, result);
        
        System.out.println("Card value: " + card);
        System.out.println("Result value: " + result);
        System.out.println("-------------------- \n\n");
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("Testing Card.setValue()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        String newCard = "K";
        
        Card instance = new Card(card, suit);
        instance.setValue(newCard);
        String expResult = newCard;
        String result = instance.getValue();
        assertEquals(expResult, result);
        
        System.out.println("Old value: " + card);
        System.out.println("New value: " + newCard);
        System.out.println("Result value: " + result);
        System.out.println("-------------------- \n\n");
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("Testing Card.getSuit()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        
        Card instance = new Card(card, suit);
        String expResult = suit;
        String result = instance.getSuit();
        assertEquals(expResult, result);
        
        System.out.println("Testing Card.setValue()");
        System.out.println("Old suit: " + suit);
        System.out.println("Result suit: " + result);
        System.out.println("-------------------- \n\n");
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("Testing Card.setSuit()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        String newSuit = "Diamonds";
        
        Card instance = new Card(card, suit);
        instance.setSuit(newSuit);
        String expResult = newSuit;
        String result = instance.getSuit();
        assertEquals(expResult, result);
        
        System.out.println("Old suit: " + suit);
        System.out.println("New suit: " + newSuit);
        System.out.println("Result suit: " + result);
        System.out.println("-------------------- \n\n");
    }

    /**
     * Test of returnCard method, of class Card.
     */
    @Test
    public void testReturnCard() {
        System.out.println("Testing Card.returnCard()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        
        Card instance = new Card(card, suit);
        List<Card> result = instance.returnCard();
        List<Card> expResult = new ArrayList<>();
        expResult.add(new Card(card, suit));
        assertEquals(expResult.toString(), result.toString());

        System.out.println("Expecting: " + expResult);
        System.out.println("Result:    " + result);
        System.out.println("-------------------- \n\n");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("Testing Card.toString()");
        System.out.println("--------------------");
        
        String card = "J";
        String suit = "Spades";
        
        Card instance = new Card(card, suit);
        String expResult = "{\"value\":\"" + card + "\",\"suit\":\"" + suit + "\"}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        System.out.println("Expecting: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("-------------------- \n\n");
    }
    
}