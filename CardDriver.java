//********************************************************************
//  CardDriver.java       Author: Lewis/Loftus/Cocking
//
//  Starter file for Solution to Programming Project 6.8
//********************************************************************
public class CardDriver
{
   //-----------------------------------------------------------------
   //  Creates a deck, shuffles the deck and deals the cards.
   //-----------------------------------------------------------------
   public static void main (String args[])
   {
     DeckOfCards deck = new DeckOfCards();
     deck.viewDeck();

     deck.shuffle();
   System.out.println("shuffled");
      deck.viewDeck();
   
   }
}
