/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

/**
 *
 * @author kepoly
 */
public class Controller {

    private double minBet = 1;
    private double maxBet = 1000;
    private double balance = 0;
    private double playerBet = minBet;

    private double previousWin = 0;
    private String option = "";
    private Boolean hasPaidOut = false;
    private List finaldeck;

    public List getFinaldeck() {
        return finaldeck;
    }

    public void setFinaldeck(List finaldeck) {
        this.finaldeck = finaldeck;
    }

    public double getMinBet() {
        return minBet;
    }

    public void setMinBet(double minBet) {
        this.minBet = minBet;
    }

    public double getMaxBet() {
        return maxBet;
    }

    public void setMaxBet(double maxBet) {
        this.maxBet = maxBet;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void removeBalance(double balance) {
        this.balance -= balance;
    }

    public double getPlayerBet() {
        return playerBet;
    }

    public void setPlayerBet(double playerBet) {
        this.playerBet = playerBet;
    }

    public double getPreviousWin() {
        return previousWin;
    }

    public void setPreviousWin(double previousWin) {
        this.previousWin = previousWin;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Boolean getHasPaidOut() {
        return hasPaidOut;
    }

    public void setHasPaidOut(Boolean hasPaidOut) {
        this.hasPaidOut = hasPaidOut;
    }

    public Boolean checkCardAce(Card in) {
        Boolean returnVal = false;
        if (isNumber(in.value)) {
            int check = Integer.parseInt(in.value);
            if (check == 11) {
                returnVal = true;
            }
        } else {
            returnVal = false;
        }
        return returnVal;
    }

    public void getNewDeck() {
        Deck newdeck = new Deck();
        List gamedeck = newdeck.getNewDeck();
        long seed = System.nanoTime();
        Collections.shuffle(gamedeck, new Random(seed));
        this.setFinaldeck(gamedeck);
    }

    public double returnTotal(List hand, Boolean showTotal) {

        int handtotal = 0;
        int handaces = 0;
        
        for (int i = 0; i < hand.size(); i++) {
            Card check = (Card) hand.get(i);
            int value;
            if (isNumber(check.value)) {
                value = Integer.parseInt(check.value);
            } else {
                value = 10;
            }
            if(!showTotal && i == 1) {
                value = 0;
            }
            handtotal += value;
            if(this.checkCardAce(check)) {
                handaces += 1;
            }
            while(handtotal > 21 && handaces > 0) {
                handtotal -= 10;
                handaces--;
            }
        }
        return handtotal;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controller control = new Controller();
        
        Deck newdeck = new Deck();
        List ddeck = newdeck.getNewDeck();

        long seed = System.nanoTime();
        Collections.shuffle(ddeck, new Random(seed));

        List playerdummy = new ArrayList<>();
        List dealerdummy = new ArrayList<>();

        Hand player = new Hand("Player", playerdummy);
        Hand dealer = new Hand("Dealer", dealerdummy);

        player.takeCardFromDeck(ddeck, 1);
        dealer.takeCardFromDeck(ddeck, 1);
        player.takeCardFromDeck(ddeck, 1);
        dealer.takeCardFromDeck(ddeck, 1);

        List playerHand = player.returnHandArray(Boolean.TRUE);
        List dealerHand = dealer.returnHandArray(Boolean.FALSE);

        //Iterator iter = hh.iterator();
        //Iterator diter = dd.iterator();
        //Object first = iter.next();
        //System.out.println(first);
        System.out.println(playerHand);
        System.out.println(player.toString());
        System.out.println("--------------");
        System.out.println(dealerHand);
        System.out.println(dealer.toString());
        System.out.println("--------------");
        System.out.println(ddeck);
        System.out.println("--------------");
        Card oo = (Card) player.hand.get(0);
        System.out.println(oo.suit);
        System.out.println(oo.value);
        System.out.println("--------------");
        System.out.println(control.returnTotal(playerHand, Boolean.TRUE));
        System.out.println(control.returnTotal(dealerHand, Boolean.FALSE));

        
    }

}
