import java.util.Random;

public class Application {
	private static Random random = new Random();

	
	public static void main(String[] args) {
		System.out.println("Starting...");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Ended");
		
		
		

	}

	public static int GetRandomNumber() {
		return random.nextInt(10);
	}
	
	
}
