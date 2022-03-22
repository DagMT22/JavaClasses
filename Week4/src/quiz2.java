import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("Ap", "Apple");
		map.put("Aa", "Aardvark");
		map.put("Ai", "Airplane");
		map.put("Bo", "Boy");
		map.put("Bi", "Bicycle");
		map.put("Ca", "Car");
		map.put("Ci", "City");
		map.put("Da", "Dance");
		
		System.out.println(map);
		
		List<String> values = new ArrayList<String>();
		for (String each : map.keySet()) {
			if (each.startsWith("A")) {
				values.add(map.get(each));
			}
		}
		System.out.println(values);
		
		Map<String, String> dictionary = new HashMap<String, String>();

		  dictionary.put("map", "a representation, usually on a flat surface, as of the features of an area of the earth or a portion of the heavens, showing them in their respective forms, sizes, and relationships according to some convention of representation");

		  dictionary.put("dictionary", "Computers. a list of codes, terms, keys, etc., and their meanings, used by a computer program or system.");

		  dictionary.put("string", "a slender cord or thick thread used for binding or tying; line. ");
		  
		  System.out.println(dictionary);
		
	}

}
