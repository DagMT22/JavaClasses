
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			output.append(log.charAt(i));
			if (i < log.length()-1) {
				output.append(" ");
				//if statement to keep from adding an extra space to the end of the string
			}
		}
		System.out.println(output);
	}

	@Override
	public void error(String error) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			output.append(error.charAt(i));
			if (i < error.length()-1) {
				output.append(" ");
				//if statement to keep from adding an extra space to the end of the string
			}
		}
		System.out.println(output);
	}
	
//	//considered making a separate method "spaced", just for building the spaced-out String instead of copy-pasting
//	//in the log and error methods. It would look like this:
//	
//	private String spaced(String input) {
//		StringBuilder output = new StringBuilder();
//		for (int i = 0; i < input.length(); i++) {
//			output.append(input.charAt(i));
//			if (i < input.length()-1) {
//				output.append(" ");
//				//if statement to keep from adding an extra space to the end of the string
//			}
//		}
//		return output.toString();
//	}
//	
//	//and using the spaced method, log and error would look like this:
//
//	@Override
//	public void log(String log) {
//		System.out.println(spaced(log));
//	}
//	
//	@Override
//	public void error(String error) {
//		System.out.println("ERROR: " + spaced(error));
//	}	
	
}
