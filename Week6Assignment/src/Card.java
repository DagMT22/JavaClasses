
public class Card {
	//declarations
	private int value;
	private String name;
	
	//constructor
	public Card(int value, String name) {		
		this.setValue(value);
		this.setName(name);
	}
	
	//getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//methods
	/**
	 * prints card information
	 */
	public void describe() {
		System.out.printf("Value: %2d   Name: %s\n",getValue(),getName());		
	}
	
}
