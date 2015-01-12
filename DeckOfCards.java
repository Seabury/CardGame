//DeckOfCards class represents a deck of playing cards.
import java.util.Random;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.ArrayList;

public class DeckOfCards
{ 
  private Card deck[]; // array of Card objects
  private int currentCard; // index of next Card to be dealt
  public static final int NUMBER_OF_CARDS = 52; // constant number of Cards
  // private Random randomNumbers; // random number generator
  // constructor fills deck of Cards
  
 public DeckOfCards ()
  { 
    deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
    currentCard = NUMBER_OF_CARDS; // set currentCard so first Card dealt is deck[ 0 ]
    // populate deck with Card objects
    
    for (int count = 0; count < deck.length; count++)
      deck[count] = new Card(count % 13, count / 13, count);

  } // end DeckOfCards constructor

  // view deck
  public void viewDeck ()
  {
    for (int count = 0; count < deck.length; count++)
      System.out.println(deck[count]);
  }

  // Deals card from deck
  public Card deal ()
  {
    if (currentCard > 0)
    {
      currentCard--;
      return deck[currentCard];
    }
    else
      return null;
  }

  // Returns # of cards left in deck
  public int getNumCardsInDeck ()
  {
    return currentCard;
  }

  // Check whether deck has cards in it
  public boolean cardsLeft ()
  {
    return (currentCard > 0);
  }

  // Shuffles the deck
  public void shuffle ()
  {
    Random shuffle = new Random();

    currentCard = NUMBER_OF_CARDS;
    
    for (int i = 0; i < NUMBER_OF_CARDS - 1; i++)
    {
      int j = shuffle.nextInt(NUMBER_OF_CARDS - i - 1) + i + 1;
      Card temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
    }
  }
 
} // end class DeckOfCards
