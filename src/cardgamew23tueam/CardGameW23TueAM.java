/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgamew23tueam;

import cardgamew23tueam.Card.Suit;
import cardgamew23tueam.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kimjeongrok
 */
public class CardGameW23TueAM {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Card[] hand = CardHandGenerator.generateHand(7);
        System.out.print("here are the cards in the hand");
        for(Card card:hand){
            System.out.println(card.getValue() +"  "+ card.getSuit());
        }
        
        //Now ask user for a card 
        System.out.print("Pick a suit for your guess card");
        for(int i=0 ; i < Card.Suit.values().length; i++){
            System.out.println(Card.Suit.values()[i]);
        }
        int suitPos = input.nextInt();
        System.out.print("Pick a value for your guess card");
        int valuePos = input.nextInt();
        
        Card userGuess = new Card(Card.Value.values()[valuePos], Card.Suit.values()[suitPos]);
        
        //now check for a match 
        boolean match = false;
        for(Card card:hand){
            if(card.getValue() == userGuess.getValue()
                    && card.getSuit().equals(userGuess.getSuit())){
            match = true;
            break;
        }//end of if
    } // end of for
    String response = match? "you guessed it right": "sorry no match...";
    System.out.println(response);
    
    }
}