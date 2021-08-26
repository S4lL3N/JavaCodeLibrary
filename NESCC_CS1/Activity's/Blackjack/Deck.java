package edu.northeaststate.sallen14;

import java.util.ArrayList;
import java.util.Random;

public class Deck{
    //local variables
    private int deckPointer = 0;
    private ArrayList<Card> cards;

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public Deck(){
        cards = new ArrayList<>();
        createDeck();
        shuffleDeck();
    }//end deck class

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public Card dealACard(boolean isFaceUp){
        Card temp = cards.get(deckPointer++);
        if(isFaceUp){
            temp.setIsfaceUp(true);
        }else{
            temp.setIsfaceUp(false);
        }//end if/else statement
        return temp;
    }//end deal a card method

//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private void createDeck() {
        //nested for loop to create a deck of cards 4 suits(i) and 13 cards(j)
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 14; j++){
                cards.add(new Card(i,j, true));
            }//end nested for loop j
        }//end for loop i

        //to print out the entire deck for testing
        /*
        for(Card card : cards){
            System.out.println(card);
        }//end for each loop
        */
    }//end create deck method


//----------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private void shuffleDeck(){
        Random random = new Random();
        for (int i = 0; i < 100000; i++){
            int index1 = random.nextInt(52);
            int index2 = random.nextInt(52);
            swap(index1, index2);
        }//end for loop
    }//end shuffle method

    //------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private void swap(int indexA , int indexB){
        Card temp = cards.get(indexA);
        cards.set(indexA, cards.get(indexB));
        cards.set(indexB, temp);

    }//end swap method

    //------------------------------------------------------------------------------------------------------------------
/*
    @Override
    public String toString() {
        return cards.toString();
    }
*/
    //------------------------------------------------------------------------------------------------------------------

}//end class
