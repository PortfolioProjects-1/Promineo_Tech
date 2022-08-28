package week6_java_final_project;

import java.util.*;


public class Deck {
	
	//Assigns each card in a 52 card deck a rank according to the rules of WAR
	Map<String, Integer> RankOfCards = Map.ofEntries(
			
	        Map.entry("Two of Clubs",2),
	        Map.entry("Two of Hearts",2),
	        Map.entry("Two of Diamonds",2),
	        Map.entry("Two of Spades",2),
	        Map.entry("Three of Clubs",3),
	        Map.entry("Three of Hearts",3),
	        Map.entry("Three of Diamonds",3),
	        Map.entry("Three of Spades",3),
	        Map.entry("Four of Clubs",4),
	        Map.entry("Four of Hearts",4),
	        Map.entry("Four of Diamonds",4),
	        Map.entry("Four of Spades",4),
	        Map.entry("Five of Clubs",5),
	        Map.entry("Five of Hearts",5),
	        Map.entry("Five of Diamonds",5),
	        Map.entry("Five of Spades",5),
	        Map.entry("Six of Clubs",6),
	        Map.entry("Six of Hearts",6),
	        Map.entry("Six of Diamonds",6),
	        Map.entry("Six of Spades",6),
	        Map.entry("Seven of Clubs",7),
	        Map.entry("Seven of Hearts",7),
	        Map.entry("Seven of Diamonds",7),
	        Map.entry("Seven of Spades",7),
	        Map.entry("Eight of Clubs",8),
	        Map.entry("Eight of Hearts",8),
	        Map.entry("Eight of Diamonds",8),
	        Map.entry("Eight of Spades",8),
	        Map.entry("Nine of Clubs",9),
	        Map.entry("Nine of Hearts",9),
	        Map.entry("Nine of Diamonds",9),
	        Map.entry("Nine of Spades",9),
	        Map.entry("Ten of Clubs",10),
	        Map.entry("Ten of Hearts",10),
	        Map.entry("Ten of Diamonds",10),
	        Map.entry("Ten of Spades",10),
	        Map.entry("Jack of Clubs",11),
	        Map.entry("Jack of Hearts",11),
	        Map.entry("Jack of Diamonds",11),
	        Map.entry("Jack of Spades",11),
	        Map.entry("Queen of Clubs",12),
	        Map.entry("Queen of Hearts",12),
	        Map.entry("Queen of Diamonds",12),
	        Map.entry("Queen of Spades",12),
	        Map.entry("King of Clubs",13),
	        Map.entry("King of Hearts",13),
	        Map.entry("King of Diamonds",13),
	        Map.entry("King of Spades",13),
	        Map.entry("Ace of Clubs",14),
	        Map.entry("Ace of Hearts",14),
	        Map.entry("Ace of Diamonds",14),
	        Map.entry("Ace of Spades",14)
	        
	);
	
	
	//creates a list of a 52 card deck
	List<String> DeckOfCards = new ArrayList<>(RankOfCards.keySet());
	
	
	//shuffles the 52 card deck 
    public void Shuffle(List<String> DeckOfCards)
    {
    	Collections.shuffle(DeckOfCards);
    }
 
    
    //draws the top card from the 52 card deck 
     public static String Draw(List<String> DeckOfCards)
    {
    	int lastindex = DeckOfCards.size() - 1;
    	String topcard = DeckOfCards.get(lastindex); 
    	DeckOfCards.remove(lastindex);
    	
    	return topcard;   	
    }
     
}
