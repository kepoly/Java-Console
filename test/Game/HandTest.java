/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryner
 */
public class HandTest {
    
    public HandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of returnHandArray method, of class Hand.
     */
    @Test
    public void testReturnHandArray() {
        System.out.println("returnHandArray");
        Boolean player = null;
        Hand instance = null;
        List expResult = null;
        List result = instance.returnHandArray(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeCardFromDeck method, of class Hand.
     */
    @Test
    public void testTakeCardFromDeck() {
        System.out.println("takeCardFromDeck");
        List inDeck = null;
        int inAmount = 0;
        Hand instance = null;
        instance.takeCardFromDeck(inDeck, inAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
