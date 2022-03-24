import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Challenges {
//Post Lecture Challenges from the instructor
		public static void main(String[] args) {
			
		//System.out.println(mostFrequent("Hello World!"));	
		//System.out.println(getAlphabetWordMap("This is only a test. Takes String input, and returns char with the highest frequency. In the event of multiple chars with highest frequency"));	

		System.out.println(sentenceCapitalizer("this is a test. hello! this? yes."));	
		
		System.out.println(alphaNumerizer("555-GET-FOOD"));
		
		String test = "Test";
		System.out.println(test.toUpperCase());
			
	}
		/**
		 * Takes String input, and returns char with the highest frequency. In the event of multiple chars with highest frequency,
		 * currently returns the first encountered char. Could return the last encountered char with the removal of a break, comment below.
		 * @param input
		 * @return
		 */
		public static char mostFrequent(String input) {
			Map<Character, Integer> frequency = new HashMap<Character, Integer>();
			for(int i = 0; i < input.length(); i++) {
				if (frequency.containsKey(input.charAt(i))) {
					//add to frequency value for char
					frequency.replace(input.charAt(i), frequency.get(input.charAt(i))+1);
				} else {
					//add char to frequency map, set frequency value to 1
					frequency.put(input.charAt(i), 1);
				}
					
			}
			//System.out.println(frequency);
			int count = 0;
			for (int each : frequency.values()) {
				if (each > count) {
					count = each;
				}
			}
			//System.out.println(count);
			char result = 0;
			for (char each : frequency.keySet()) {
				if (count == frequency.get(each)) {
					result = each;
					break; //break here returns first char in the event of a tie. Removal of break returns last char in the event of a tie.
				}
			}
			return result;
		}

		/**
		 * takes String input and returns alphabet word map. Trims out . and , and ? 
		 * @param input
		 * @return
		 */
		public static Map<Character, Set<String>> getAlphabetWordMap(String input){
			//scan for word - start at 0, then find next space. send word to map, then shift end space index value to start and repeat. Trim . and , .
			SortedMap<Character, Set<String>> result = new TreeMap<Character, Set<String>>();
			int start = 0;
			String word;
			char key = 0;
			Set<String> set;
			
			
			while (start < input.length()) {
			//System.out.println(start);
			int end = input.indexOf(' ', start+1);
			if (end < 0) {
				end = input.length();
			}
			//System.out.println(start);
			//System.out.println(end);
			//System.out.println(input.substring(start, end));
//String = 			input.substring(start, end)
			word = input.substring(start, end).toLowerCase().replace(",", "").replace(".", "").replace("?", "");
			//use replace to trim out characters
			//System.out.println(word);
			key = word.charAt(0);
//Key = 			input.substring(start, end).toLowerCase().charAt(0)
			if (!result.containsKey(key)) {
				set = new HashSet<String>();
				result.put(key, set);
				}
			
			result.get(key).add(word);
			//System.out.println(result);
			start = end+1;
			}
			
			
			return result;
		}
 
		/**
		 * Takes String input and capitalizes the first word of the string, and then every character that follows a punctuation ".", "!", "?"
		 * @param input
		 * @return
		 */
		public static String sentenceCapitalizer(String input) {
			String holding;
			StringBuilder result = new StringBuilder();
			result.append(input);
//			System.out.println("store" + result);
			
			result.replace(0, 1, result.substring(0, 1).toUpperCase());
//			System.out.println("Capitalize first letter " + result);

			int pos = 0;
			while (pos >= 0 && pos != result.length()) {
				pos = result.indexOf(".", pos+1);
//				System.out.println(pos);
				if (pos < 0 || pos == result.length()-1) {
					break;
				}
				result.replace(pos+2, pos+3, result.substring(pos+2, pos+3).toUpperCase());
//				System.out.println(result);
			}
			pos = 0;
			while (pos >= 0 && pos != result.length()) {
				pos = result.indexOf("!", pos+1);
//				System.out.println(pos);
				if (pos < 0 || pos == result.length()-1) {
					break;
				}
				result.replace(pos+2, pos+3, result.substring(pos+2, pos+3).toUpperCase());
//				System.out.println(result);
			}
			pos = 0;
			while (pos >= 0 && pos != result.length()) {
				pos = result.indexOf("?", pos+1);
//				System.out.println(pos);
				if (pos < 0 || pos == result.length()-1) {
					break;
				}
				result.replace(pos+2, pos+3, result.substring(pos+2, pos+3).toUpperCase());
//				System.out.println(result);
			}
			
			
			
			return result.toString();
			
			
			//capitalize first letter of string
			
			//capitalize the 2nd letter after every ".", "!", or "?"
			
			
			
			
			
		}
		
		/**
		 * takes an alphanumeric phone number and number-izes it
		 * @param phonenumber
		 * @return
		 */
		public static String alphaNumerizer(String phonenumber) {
			StringBuilder number = new StringBuilder();
			
			Map<Character, Character> translation = new HashMap<Character, Character>();
			translation.put('-', '-');
			translation.put('1', '1');
			translation.put('2', '2');
			translation.put('A', '2');
			translation.put('B', '2');
			translation.put('C', '2');
			translation.put('3', '3');
			translation.put('D', '3');
			translation.put('E', '3');
			translation.put('F', '3');
			translation.put('4', '4');
			translation.put('G', '4');
			translation.put('H', '4');
			translation.put('I', '4');
			translation.put('5', '5');
			translation.put('J', '5');
			translation.put('K', '5');
			translation.put('L', '5');
			translation.put('6', '6');
			translation.put('M', '6');
			translation.put('N', '6');
			translation.put('O', '6');
			translation.put('7', '7');
			translation.put('P', '7');
			translation.put('Q', '7');
			translation.put('R', '7');
			translation.put('S', '7');
			translation.put('8', '8');
			translation.put('T', '8');
			translation.put('U', '8');
			translation.put('V', '8');
			translation.put('9', '9');
			translation.put('W', '9');
			translation.put('X', '9');
			translation.put('Y', '9');
			translation.put('Z', '9');
			translation.put('0', '0');
			
			for (int i = 0; i < phonenumber.length(); i++) {
				number.append(translation.get(phonenumber.toUpperCase().charAt(i)));
			}
			System.out.println(number);
						
			return "test";
		}
		
		
		
		
		
}
