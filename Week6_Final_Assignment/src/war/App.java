package war;

public class App {
	
	public static void main(String[] args)
    {
		//constructor for 52 card deck
		Deck deck = new Deck();
		
		//constructor for player1 card information
		Card player1card = new Card();
		
		//constructor for player2 card information
		Card player2card = new Card();
		
		
		//Shuffle the 52 card deck
		deck.Shuffle(deck.DeckOfCards);
		
		
		//constructor for Player 1
		Player player1 = new Player();
		
		
		//constructor for Player 2
		Player player2 = new Player(); 
		
		
		//iterate through 52 card deck to assign player1 26 cards
		for(int i=0; i<deck.DeckOfCards.size();i++) 
		{					
			player1.Draw(deck.DeckOfCards, player1.HandOfCards);
		}	
		
		//assigns remaining 26 cards to player2
		player2.HandOfCards = deck.DeckOfCards;
		
						
		//iterate through 26 card deck to compare player hands and generate player scores
		for(int i=0; i<26;i++) 
		{					
			player1card.setName(Player.Flip(player1.HandOfCards));
			player2card.setName(Player.Flip(player2.HandOfCards));
			
			player1card.setValue(deck.RankOfCards.get(player1card.getName()));
			player2card.setValue(deck.RankOfCards.get(player2card.getName()));
			
			//System.out.println(i);
			
			if (player1card.getValue() > player2card.getValue())
			{
				player1.IncrementScore();				
			}
			else if (player1card.getValue() < player2card.getValue())
			{
				player2.IncrementScore();				
			}			
		}	
		
		if (player1.PlayerScore > player2.PlayerScore)
		{
			System.out.println("Player1 Wins\n"+"Player1 Score : "+player1.PlayerScore+"\nPlayer2 Score : "+player2.PlayerScore);
		}
		else if (player1.PlayerScore < player2.PlayerScore)
		{
			System.out.println("Player2 Wins\n"+"Player1 Score : "+player1.PlayerScore+"\nPlayer2 Score : "+player2.PlayerScore);
		}
		else if (player1.PlayerScore == player2.PlayerScore)
		{
			System.out.println("Draw\n"+"Player1 Score : "+player1.PlayerScore+"\nPlayer2 Score : "+player2.PlayerScore);
		}
				
    }

}
