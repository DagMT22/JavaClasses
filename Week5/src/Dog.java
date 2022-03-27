
public class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("Woof!");
	}

	@Override
	public String getFavoriteFoodName() {
		return "Dog Food";
	}

}
