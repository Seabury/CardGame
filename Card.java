//********************************************************************
//  Card.java       
//
//********************************************************************

public class Card
{
  String faces[] = { "Ace", "Two", "Three", "Four", "Five", "Six", 
      "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
   String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

   private boolean cardInDeck ;
   private final static int NUM_FACES = 13;
   private final static int NUM_SUITS = 4;

   int faceIndex, suitIndex,randomFace, randomSuit;
   private String faceName, suitName;

   //-----------------------------------------------------------------
   //  Creates a card of the specified suit and face value.
   //-----------------------------------------------------------------
   public Card (int faceI, int suitI)
   {
      faceName = faces[faceI];
      faceIndex=faceI+1;
      suitName = suits[suitI];
      }

 
   //-----------------------------------------------------------------
   //  Returns the face (numeric value) of this card.
   //-----------------------------------------------------------------
   public int getFace ()
   {
      return faceIndex;
   }

   //-----------------------------------------------------------------
   //  Returns the suit (numeric value) of this card.
   //-----------------------------------------------------------------
   public int getSuit ()
   {
      return suitIndex;
   }

   //-----------------------------------------------------------------
   //  Returns the face (string value) of this card.
   //-----------------------------------------------------------------
   public String getFaceName ()
   {
      return faceName;
   }

   //-----------------------------------------------------------------
   //  Returns the suit (string value) of this card.
   //-----------------------------------------------------------------
   public String getSuitName ()
   {
      return suitName;
   }

   //-----------------------------------------------------------------
   //  Returns the string representation of this card, including
   //  both face and suit.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return getFaceName() + " of " + getSuitName();
   }
}
