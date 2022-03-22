
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class quiz1 {

	static void halfList(List words) {
		// Add your code below this line 
		List<String> half = new ArrayList<>();
		for (int i = 0; i < words.size(); i += 2){
		    half.add(words.get(i).toString());
		}
		System.out.println(words);
		System.out.println(half);
		
		
		
		// Add your code above this line 
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1, word2, word3, word4, word5;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		word4 = in.nextLine();
		word5 = in.nextLine();
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		//halfList(words);
		System.out.println(words);
		System.out.println(createListWithEveryOtherElement(words));
	}
	
	public static <T> List<T> createListWithEveryOtherElement(List<T> list) {

		List<T> newList = new ArrayList<T>();

		for (int i = 0; i < list.size(); i+= 2) {

		newList.add(list.get(i));

		     }

		return newList;

		}
	
	
	
	
	
	
	
	
}