/**
 * Name: Shae Allen
 * Date: 11/19/2019
 * Project: Project 6 Blackjack game
 * Getting Started -This program will demonstrate the input/process/output paradigm. This program is a Blackjack game.
 *                  The program uses objects to create players, a deck, and cards. The program deals cards and prompts
 *                  user to hit or stay. If the user has a higher hand the program will make the dealer hit until he
 *                  has a wining hand or busts. The program uses a custom exception to check for a busted hand. The
 *                  program uses try/catch constructs to calculate the player/dealers hand values and determine a winner.
 */

package edu.northeaststate.sallen14;
import java.util.Scanner;

public class Driver {
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public static void main(String[] args){
        //input object
        Scanner cin = new Scanner(System.in);
        //input string
        String input;
        //_________PROCESS AND OUTPUT___________________________________
        //calling the printHeader method
        printHeader();

        //instantiation of deck object
        Deck deck = new Deck();

        //instantiation of the player objects
        Player dealer = new Player("Dealer");
        Player player = new Player("Player");

        //calling the addCardToHand method to deal cards to dealer and player
        dealer.addCardToHand(deck.dealACard(true));
        dealer.addCardToHand(deck.dealACard(false));

        player.addCardToHand(deck.dealACard(true));
        player.addCardToHand(deck.dealACard(true));

        //try/catch construct to calculate the weight of the player's hand
        try{
            player.calculateHandValue();

        }catch (BustedException err){
            //System.out.println("Dealer Busted");
            //System.out.println(err.getMessage());
            System.out.println(err.getMessage() + " " + err.getValue());
        }//end try/catch

        //print the dealers and the players hand to the console
        System.out.println();
        System.out.println(dealer);
        System.out.println(player);
        //_________INPUT PROCESS AND OUTPUT___________________________________
        //while loop to ask the player if they want to stay or hit and calculate hand weight
        while(true){
            System.out.print("\nWould you like to hit(H) or stay(S)? ");
            input =cin.nextLine();
            System.out.println();
            //if statement to check input for hit or stay
            if (input.equalsIgnoreCase("H")){
                player.addCardToHand(deck.dealACard(true));
                //System.out.println(player);

                //variable
                //int dealerHandValue = 0;
                //try/catch to calculate the weigh of the hand for the player and dealer
                try{
                    player.calculateHandValue();
                    //dealerHandValue = dealer.calculateHandValue();
                    System.out.println(dealer );
                    System.out.println(player);
                    //System.out.println();


                }catch(BustedException err){
                    System.out.println(err.getMessage() + " " + err.getValue());
                    dealer.flipCardsToFaceUp();
                    System.out.println(dealer + " Dealer wins!!!");
                    //System.out.println(dealer + Integer.toString(dealerHandValue) + " Dealer wins!!!");
                    System.exit(1);
                }//end try/catch

            }else {
                break;
            }//end if/else statement
        }//end while loop
//----------------------------------------------------------------------------------------------------------------------
        //_________PROCESS AND OUTPUT___________________________________
        //calling the flipCardsToFaceUp method
        dealer.flipCardsToFaceUp();
        //try/catch to calculate the weigh of the hand for the player and dealer and determine if the dealer need to hit
        try {
            int dealerHandValue = dealer.calculateHandValue();
            int playerHandValue = player.calculateHandValue();
            System.out.println(dealer +" Hand Value = " + dealerHandValue);
            //if statement to check for a tie. if there is the dealer hits
            if (dealerHandValue == playerHandValue){
                System.out.println("Dealer Hits");
                dealer.addCardToHand(deck.dealACard(true));
                dealerHandValue = dealer.calculateHandValue();
                System.out.println(dealer +" Hand Value = " + dealerHandValue);
            }
            //if statement to check if dealer wins
            if(dealerHandValue > playerHandValue){
                dealer.flipCardsToFaceUp();
                System.out.println(dealer + "Hand Value= " +  Integer.toString(dealerHandValue) + " Dealer wins!!!");
                System.exit(1);
            }
            //while loop to make dealer hit until either wins or busts
            while(dealerHandValue < playerHandValue){
                System.out.println("Dealer Hits");
                dealer.addCardToHand(deck.dealACard(true));
                dealerHandValue = dealer.calculateHandValue();
                System.out.println(dealer +" Hand Value = " + dealerHandValue);
                if(dealerHandValue > playerHandValue){
                    dealer.flipCardsToFaceUp();
                    System.out.println(dealer + "Hand Value= " + Integer.toString(dealerHandValue) + " Dealer wins!!!");
                    break;
                }

            }//end while loop
        } catch(BustedException err){
            System.out.println(err.getMessage() + " " + err.getValue());
            System.out.println(player + " wins!!!");
        }


        /*
        System.out.println(deck.dealACard(true));
        System.out.println(deck.dealACard(true));

        System.out.println();

        System.out.println(deck.dealACard(true));
        System.out.println(deck.dealACard(true));
*/
        /*
        Card card = new Card(0,0);
        Card card2 = new Card(0,1);

        card.setIsfaceUp(true);//sets card face up
        //card2.setIsfaceUp(true);

        System.out.println(card);
        System.out.println(card2);
*/

    }//end main
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public static void printHeader(){
        System.out.println("|============================================|");
        System.out.println("|============ $$$$ BLACKJACK $$$$ ===========|");
        System.out.println("|============================================|");
    }
    //------------------------------------------------------------------------------------------------------------------
}//end class
