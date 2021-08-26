package edu.northeaststate.sallen14;

import java.util.ArrayList;

public class Player {
    //local variables
    private ArrayList<Card> hand = new ArrayList<>();
    private String name;
    private int value = 0;

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public Player(String name){
        this.name = name;
    }//end player method

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public void addCardToHand(Card card){
        hand.add(card);
    }//end add card method

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public int calculateHandValue() throws BustedException {
        this.value = 0;
        for (int i = 0; i < hand.size(); i++){
            //System.out.println("Card " + i + " weight: " + hand.get(i).getWeight());
            this.value += hand.get(i).getWeight();
            //for handling the ace
            if(hand.get(i).getWeight() == 11 && this.value > 21){
                this.value -= 10;
            }

            //System.out.println("hand value: " + this.value);
            //System.out.println();
        }
        //System.out.println(this.value);

        if (this.value > 21){
            if(name.equals("Dealer")) {
                throw new BustedException( name + hand + " Busted", this.value);
                //System.exit(1);
            }else{
                throw new BustedException( name + hand + " Busted", this.value);
                //System.exit(1);
            }
        }
        if(this.value == 21 && name.equals("Player")){
            System.out.println("Blackjack!!!!");
            System.out.println(name + hand + " " + this.value + " wins!!!");
            System.exit(1);
        }
        if(this.value == 21 && name.equals("Dealer")){
            System.out.println("Blackjack!!!!");
            System.out.println(name + hand  + " " + this.value + " wins!!!");
            System.exit(1);
        }

        return this.value;
    }//end calculate hand method
    //------------------------------------------------------------------------------------------------------------------
    //getter
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public int getValue() {
        return this.value;
    }
    //------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public void flipCardsToFaceUp(){
        for(int i = 0; i < hand.size(); i++){
            hand.get(i).setIsfaceUp(true);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    @Override
    public String toString() {
        if(name.equals("Player")) {
            return name + hand + " Hand Value = " + value;
        }else{
            return name + hand;
        }
    }
    //------------------------------------------------------------------------------------------------------------------

}//end class
