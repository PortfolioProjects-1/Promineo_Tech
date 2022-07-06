package war;

import java.util.*;

public class Player {
	
	List<String> HandOfCards = new ArrayList<String>();
	
	int PlayerScore = 0;
	String PlayerName;
	

	//draws the top card from the 52 deck of cards and adds it to a player's hand
	public void Draw(List<String> DeckOfCards, List<String> HandOfCards) 
	{				
		String topcard = Deck.Draw(DeckOfCards);
		HandOfCards.add(topcard);				
	}
	
		
	//removes the last card of a players hand
	public static String Flip(List<String> HandOfCards) 
	{
		int lastindex = HandOfCards.size() - 1;
    	String topcard = HandOfCards.get(lastindex); 
    	HandOfCards.remove(lastindex);
    	
    	return topcard; 		
	}
	
	
	//increments a players score by one 
	public void IncrementScore() 
	{
		PlayerScore = PlayerScore + 1;		
	}

}
