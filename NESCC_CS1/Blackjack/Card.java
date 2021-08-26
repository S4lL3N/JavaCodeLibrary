package edu.northeaststate.sallen14;

public class Card {
    //local variables
    private int weight;
    private String name;
    private String suit;
    private boolean isFaceUp;
    //_________PROCESS______________________________________
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public Card(int suit, int value, boolean isFaceup){
        //assigning local variable values by calling the convertValueToWeight, convertValueToSuit and convertValueToName methods
        this.weight = this.convertValueToWeight(value);
        this.suit = this.convertValueToSuit(suit);
        this.name = this.convertValueToName(value);
        this.isFaceUp = isFaceUp;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private int convertValueToWeight(int value) {
        //local variable
        int cardWeight = 0;
        //switch statement to assign the card weight/value
        switch(value) {
            case 1:
                cardWeight = 11;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                cardWeight = value;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                cardWeight = 10;
                break;
        }

        return cardWeight;
    }
    //------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private String convertValueToName(int value){
        //local variable
        String name = "";
        //switch statement to assign the name of the cards
        switch(value) {
            case 1:
                name = "Ace";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                name = Integer.toString(value);
                break;
            case 11:
                name = "Jack";
                break;
            case 12:
                name = "Queen";
                break;
            case 13:
                name = "King";
                break;
        }

        return name;
    }
    //------------------------------------------------------------------------------------------------------------------
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    private String convertValueToSuit(int value){
        //variable
        String suit = "";
        //switch statement to assign the card suit
        switch(value) {
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;
        }

        return suit;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    //Getters and Setters
    public String getSuit() {
        return suit;
    }
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public String getName() {
        return name;
    }
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public boolean getIsfaceUp() {
        return isFaceUp;
    }
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public void setIsfaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    //override the base toString to print out the object instead of memory reference
    @Override
    public String toString() {
        if(isFaceUp){
            return name + " of " + suit;
        }else{
            return "*****";
        }
    }//end toString method

    //------------------------------------------------------------------------------------------------------------------

}//end class
