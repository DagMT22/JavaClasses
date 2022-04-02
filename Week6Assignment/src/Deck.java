import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	//declarations
	enum Suit {
		Spades, Diamonds, Clubs, Hearts
	}
	
	private List<Card> deck = new ArrayList<Card>();
	Random random = new Random();
	
	//constructor
	public Deck() {
		buildDeck();
	}
	
	
	//getters and setters
	public List<Card> getDeck() {
		return this.deck;
	}

	public void setDeck(List<Card> cards) {
		this.deck = cards;
	}
	
	
	//Methods	
	/**
	 * Lists cards in deck, using card.describe()
	 */
	public void describe() {
		for(Card each : getDeck()) {
			each.describe();			
		}
	}
	
	/**
	 * Draws(returns) a card from Deck at index 0, then removes that card from the deck.
	 * @return Card from index 0 of Deck
	 */
	public Card draw() {			
		Card result = getDeck().get(0);
		getDeck().remove(0);
		return result;
	}
	
	/**
	 * Shuffle the deck, using a random (10-50) number of riffles, random cuts and random overhands
	 * I wanted to try out these variants on shuffling based on real physical cards, but maybe a better 
	 * alternative would be to use Collections.shuffle(getDeck()); When there isn't enough shuffling of the deck, there 
	 * are many more Draws/Ties when simulating games.
	 * @param riffle number of riffle shuffles to perform
	 * @param cut number of random cuts to perform
	 * @param overhand number of overhands to perform
	 */
	public void shuffle() {
		int riffle = random.nextInt(10, 50);
		int cut = random.nextInt(10, 50);
		int overhand = random.nextInt(10, 50);
		while (riffle+cut+overhand > 0) {
			if (riffle > 0) {
				riffleShuffle();
				riffle--;
			}
			if (cut > 0) {
				cutShuffle();
				cut--;
			}
			if (overhand > 0) {
				overhandShuffle();
				overhand--;
			}
		}		
	}
			
	/**
	 * Overloaded method, Shuffles the deck, using a specified number of riffles, random cuts and random overhands
	 * @param riffle number of riffle shuffles to perform
	 * @param cut number of random cuts to perform
	 * @param overhand number of overhands to perform
	 */
	public void shuffle(int riffle, int cut, int overhand) {
		while (riffle+cut+overhand > 0) {
			if (riffle > 0) {
				riffleShuffle();
				riffle--;
			}
			if (cut > 0) {
				cutShuffle();
				cut--;
			}
			if (overhand > 0) {
//				overhandShuffle();
				overhand--;
			}
		}		
	}
	
	/**
	 * Cuts the deck, using a random point in the middle 1/3rd of the deck
	 */
	public void cutShuffle() {
		int pick = random.nextInt(16, 34); //pick a point in the middle 1/3rd of the deck
		List<Card> result = new ArrayList<Card>();
		for (int i = pick; i < 52; i++) {
			result.add(getDeck().get(i));
		}
		for (int i = 0; i < pick; i++) {
			result.add(getDeck().get(i));
		}
		setDeck(result);
	}
	
	/**
	 * Cuts the deck, Overloaded to using a specific point when using an int argument
	 * @param pick Point where deck is cut; value 26 cuts the deck in half
	 */
	public void cutShuffle(int pick) {		
		List<Card> result = new ArrayList<Card>();
		for (int i = pick; i < 52; i++) {
			result.add(getDeck().get(i));
		}
		for (int i = 0; i < pick; i++) {
			result.add(getDeck().get(i));
		}
		setDeck(result);
	}
	
	/**
	 * Performs a "perfect in-riffle" shuffle. Note, 52 consecutive "in-riffles" returns the deck to its original state. 8 "out-riffles" would also return a deck to original state
	 */
	public void riffleShuffle() {
		List<Card> result = new ArrayList<Card>();
		for (int i=0; i < 26; i++) {
			result.add(getDeck().get(i+26)); //performing a "perfect in-riffle", where deck is cut in half and alternating cards are placed into a new deck
			result.add(getDeck().get(i)); //an "in-riffle" starts with the inner card, and has more mixing than an "out-riffle" that leaves the first and last cards in place
		}
		setDeck(result);
	}
	
	/**
	 * Performs a "perfect out-riffle" shuffle. This method leaves the first and last cards in place and results in less mixing.
	 * Commonly utilized by magicians, only 8 "perfect out-riffle" shuffles are required to return a deck to its original state.
	 */
	public void outRiffleShuffle() {
		List<Card> result = new ArrayList<Card>();
		for (int i=0; i < 26; i++) {
			result.add(getDeck().get(i)); 
			result.add(getDeck().get(i+26));		
		}
		setDeck(result);
	}
	
	/**
	 * Overhand Shuffle, where stacks of cards are grabbed from the top and transferred to the bottom. The size of the stack is random.
	 */
	public void overhandShuffle() {
		List<Card> result = new ArrayList<Card>();
		int size = random.nextInt(1, 51);
		int spot = 52 - size;
		while(spot > 0) {
			for (int i = 0; i < size; i++) {
				result.add(getDeck().get(i+spot));
			}
			spot -= size;
		}
		for (int i = 0; i < size; i++) {
			if(spot + i >= 0) {
				result.add(getDeck().get(i+spot));
			}
		}
		setDeck(result);
	}
	
	/**
	 * Overhand Shuffle, where stacks of cards are grabbed from the top and transferred to the bottom
	 * @param size This Overloaded version allows you to specify the size of the the stacks, and size 1 reverses the deck order
	 */
	public void overhandShuffle(int size) {
		List<Card> result = new ArrayList<Card>();
		int spot = 52 - size;
		while(spot > 0) {
			for (int i = 0; i < size; i++) {
				result.add(getDeck().get(i+spot));
			}
			spot -= size;
		}
		for (int i = 0; i < size; i++) {
			if(spot + i >= 0) {
				result.add(getDeck().get(i+spot));
			}
		}
		setDeck(result);
	}
	
		/**
	 * Builds fresh deck, making new list of Cards iterating over suits and values
	 * @return fresh list of cards for a new deck
	 */
	private void buildDeck(){
		List<Card> newDeck = new ArrayList<Card>();
			for (Suit each : Suit.values()) {
				for(int i = 2; i <= 14; i++) {
					newDeck.add(new Card(i, translate(i) + " of " + each));
				}
			}
		setDeck(newDeck);
	}
	
	/**
	 * Translates card value to card type, used in buildDeck (One, Two,... ,King, Ace)
	 * @param value Card value, range 2 - 14
	 * @return Card type as String, based on value
	 */
	private String translate(int value) {
		switch (value) {
		case 2: return "Two";
		case 3: return "Three";
		case 4: return "Four";
		case 5: return "Five";
		case 6: return "Six";
		case 7: return "Seven";
		case 8: return "Eight";
		case 9: return "Nine";
		case 10: return "Ten";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		case 14: return "Ace";	
		default: return "Invalid";
		}
	}
	
	/**
	 * empties a deck, for the creation of an empty discard deck, for testing
	 */
	public void empty() {
		setDeck(new ArrayList<Card>());
	}
}
	
	
	

