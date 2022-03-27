
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		//top line of box
		System.out.print("**********");
		for (int i = 0; i < error.length(); i++) {
			System.out.print("*");
		}
		System.out.println("***");
		//middle of box
		System.out.println("***Error: " + error + "***");
		//bottom of box
		System.out.print("**********");
		for (int i = 0; i < error.length(); i++) {
			System.out.print("*");
		}
		System.out.println("***");
		
	}

}
