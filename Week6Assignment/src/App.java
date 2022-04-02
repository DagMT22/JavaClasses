

public class App {

	public static void main(String[] args) {
				
		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		Player player1 = new Player("Thomas");
		Player player2 = new Player("Sondra");
		
		Deck discard = new Deck();
		discard.empty();

		Deck gameDeck = new Deck();		
		gameDeck.shuffle();
		
		//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(gameDeck);
			} else {
				player2.draw(gameDeck);
			}
		}
		
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			discard.getDeck().add(card1);
			discard.getDeck().add(card2);
			
			//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
			} //if there is a tie, nobody gets a point				
		}
		
		//After the loop, compare the final score from each player. 
		//Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		System.out.println("Final Scores: \n" + player1.getName() + ": " + player1.getScore() + "  vs  " + player2.getName() + ": " + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 Wins! Congratulations " + player1.getName());
			player1.incrementWins();
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 Wins! Congratulations " + player2.getName());
			player2.incrementWins();
		} else {
			System.out.println("It is a Draw! Play again?");
		}
		
		
	}

}
