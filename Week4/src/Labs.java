import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Labs {
	public static void main(String[] args) {

		StringBuilder numbers = new StringBuilder();
		numbers.append("0");
		for (int i = 1; i < 10; i++) {
			numbers.append("-" + i);
		}
		System.out.println(numbers.toString());
		
//		String[] names = {"Alan", "Batman", "Christopher", "Daniel", "Ed"};		
//		printArray(names);
		
		List<String> names = new ArrayList<String>();
		names.add("Alan");
		names.add("Batman");
		names.add("Christopher");
		names.add("Daniel");
		names.add("Ed");
		
//		printList(names);
//		
//		System.out.println(shortestString(names));
//		
//		System.out.println("*****");
//		printList(swapFirstLast(names));
		
		System.out.println(concat(names));
		
		System.out.println(concat(search(names, "an")));
		
		//printList(fillNumbersList(1, 1, 20));
		
		System.out.println(concat(divisible(fillNumbersList(1, 1, 20)).get(0)));
		System.out.println(concat(divisible(fillNumbersList(1, 1, 20)).get(1)));
		System.out.println(concat(divisible(fillNumbersList(1, 1, 20)).get(2)));
		System.out.println(concat(divisible(fillNumbersList(1, 1, 20)).get(3)));
		
		System.out.println("*********");
		
		printList(lengths(names));
		System.out.println(lengths(names));
		System.out.println(names);
		
		Set<String> set = new HashSet<String>();
		set.add("Montana");
		set.add("Idaho");
		set.add("Washington");
		set.add("Oregon");
		set.add("Utah");
		System.out.println(set);
		System.out.println(startsWith(set, 'I'));
		
		System.out.println(setToList(set));
		
		Set<Integer> numberSet = fillNumbersSet(1, 1, 30);
		System.out.println(numberSet);
		System.out.println(setEven(numberSet));
		Collections.sort(null);
		
//		System.out.println(primeList(20));
//		
//		Instant start = Instant.now();
//		System.out.println(start);
//		List<Integer> primes = primeList(5000);
//		Instant finish = Instant.now();
//		System.out.println(finish);
//		System.out.println(Duration.between(start, finish).toMillis()/1000.0 + " s");
//		System.out.println("Prime " + primes.size() + " : " + primes.get(primes.size()-1));
//		
//		int width = 10;
//		for (int i = 0; i < primes.size()/width; i++) {
//			for (int j = 0; j < width; j++) {
//			System.out.printf("%7d ", primes.get(i*width + j));
//			}
//			System.out.println();
//		}
//		
//		//Try seive of Eratosthenes
//		//Try Sieve of Atkin
//		//Compare computation times
		
		
		ArrayList<String> listName = new ArrayList<String>();
		listName.add("Hello");
		listName.add("World");
		System.out.println(listName);
		
		Set<StringBuilder> setName = new HashSet<StringBuilder>();
		StringBuilder addition = new StringBuilder();
		addition.append('*');
		for ( int i = 0; i < 5; i++) {
			setName.add(addition.append(i));
			
			System.out.println(addition);
		}
		
		System.out.println(setName.size());
	//	for (StringBuilder each : )

		
		
		
		
	}
	
	/**
	 * Prints an array
	 * @param <T> Generic Type
	 * @param array
	 */
	public static <T> void printArray (T[] array) {
		for (T each : array) {
			System.out.println(each);
		}
	}

	/**
	 * Prints a list
	 * @param <T>
	 * @param array
	 */
	public static <T> void printList(List<T> array) {
		for (T each : array) {
			System.out.println(each);
		}
	}
	
	/**
	 * returns shortest String in a list of String
	 * @param list
	 * @return
	 */
	public static String shortestString (List<String> list){
		int length = list.size();
		int index = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() < length) {
				index = i;
			}
		}
		return list.get(index);
	}
	
	/**
	 * take list and return list with first and last swapped
	 * @param list
	 * @return
	 */
	public static List<String> swapFirstLast (List<String> list) {
		String first = list.get(0);
		//String last = list.get(list.size()-1); checked to see if we only needed one extra String
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, first);
		return list;
	}
	
	/**
	 * concatenates the List into a String
	 * @param list
	 * @return
	 */
	public static <T> String concat (List<T> list) {
		StringBuilder concat = new StringBuilder();
		for (T each : list) {
			concat.append(each);
			concat.append(",");
		}
		concat.deleteCharAt(concat.length()-1);
		return concat.toString();
		
	}

	/**
	 * search a list of String, and return a list of Strings that contain a search paramter
	 * @param list
	 * @param string
	 * @return
	 */
	public static List<String> search (List<String> list, String string){
		List<String> result = new ArrayList<String>();
		for (String each : list) {
			if (each.contains(string)) {             //case sensitive
				result.add(each);
			}
		}
		return result;
	}
	
	public static List<List<Integer>> divisible (List<Integer> list){
		// 0 - divisible by 2
		// 1 - divisible by 3
		// 2 - divisible by 5
		// 3 - not divisible by 2, 3, 5		
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> div2 = new ArrayList<Integer>();	
		List<Integer> div3 = new ArrayList<Integer>();	
		List<Integer> div5 = new ArrayList<Integer>();	
		List<Integer> nodiv = new ArrayList<Integer>();	
		
		for (int each : list) {
			if(each % 2 == 0) {
				div2.add(each);
			}
			if(each % 3 == 0) {
				div3.add(each);
			}
			if(each % 5 == 0) {
				div5.add(each);
			}
			if (each % 5 != 0 && each % 3 != 0 && each % 2 != 0) {
				nodiv.add(each);
			}
		}
		result.add(div2);
		result.add(div3);
		result.add(div5);
		result.add(nodiv);
		
		return result;
	}
	
	public static List<Integer> fillNumbersList (int start, int interval, int count){
		List<Integer> numbersList = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			numbersList.add(start + interval * i);
		}
		return numbersList;
	}
	
	public static Set<Integer> fillNumbersSet (int start, int interval, int count){
		Set<Integer> numbersSet = new HashSet<Integer>();
		for (int i = 0; i < count; i++) {
			numbersSet.add(start + interval * i);
		}
		return numbersSet;
	}
	
	public static List<Integer> lengths (List<String> strings) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String each : strings) {
			lengths.add(each.length());
		}
		return lengths;
	}
	
	public static Set<String> startsWith (Set<String> set, char search) {
		Set<String> result = new HashSet<String>();
		for (String each : set) {
			if (each.charAt(0) == search) {
				result.add(each);
			}
		}
		return result;
	}
	
	public static List<String> setToList (Set<String> set) {
		List<String> result = new ArrayList<String>();
		for (String each : set) {
			result.add(each);
		}
		return result;
	}
	
	public static Set<Integer> setEven (Set<Integer> set) {
		Set<Integer> result = new HashSet<Integer>();
		for (int each : set) {
			if(each % 2 == 0) {
				result.add(each);
			}
		}
		return result;
	}

	public static List<Integer> primeList (int size){
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int start = 3;
		while( primes.size()<size) {
			boolean test = true;
			for(int each : primes) {
				if( start % each == 0) {
					test = false;
				}
			}
			if (test) {
				primes.add(start);
			}
			start += 2;
		}
		return primes;
	}
	
	
	
	
	
	
	
	
}
