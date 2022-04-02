import java.util.ArrayList;
import java.util.List;

public class Player {
	//declarations
	private List<Card> hand;
	private int score;
	private String name;
	private int wins;
	
	//constructor
	public Player(String name) {
		setHand(new ArrayList<Card>());
		setScore(0);
		setName(name);
	}

	
	//getters and setters
	public List<Card> getHand() {
		return hand;
	}
	
	//setHand can be private, as hands will be built using Draw
	private void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	
	//setScore can be private, unless we plan to alter scores directly outside of the methods increment and reset
	private void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public int getWins() {
		return wins;
	}
	
	private void setWins(int wins) {
		this.wins = wins;
	}


	//methods
	/**
	 * Describe method prints player name, score, and lists the cards in their hand	
	 */
	public void describe() {
		System.out.println("Player: " + getName());
		System.out.println("Score: " + getScore());
		System.out.println("Hand:");
		for (Card each : getHand()) {
			each.describe();
		}
	}
	
	/**
	 * returns the first card in player's hand, and removes that card from their hand
	 * @return Card from index 0 of hand
	 */
	public Card flip() {
		Card result = getHand().get(0);
		getHand().remove(0);
		return result;
	}
	
	/**
	 * draws card from deck using Deck.draw() method, and adds that card to player hand
	 * @param deck Deck that will be losing a card to the player's hand
	 */
	public void draw(Deck deck) {
		getHand().add(deck.draw());
	}
	
	/**
	 * increases score by 1
	 */
	public void incrementScore() {
		setScore(getScore()+1);
	}

	/**
	 * increases wins by 1
	 */
	public void incrementWins() {
		setWins(getWins()+1);
	}
	
	/**
	 * resets player score and hand, but not wins
	 */
	public void reset() {
		setScore(0);
		setHand(new ArrayList<Card>());
	}
		
}
