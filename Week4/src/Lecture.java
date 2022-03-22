
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.lang.Math;
import java.awt.event.KeyListener;

public class Lecture {
	public static void main(String[] args) throws InterruptedException {
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(4);
//		numbers.add(5);
		
//		System.out.println(mostFrequent("This is a Test Phrase"));
//		drawCircle(50, 50, 20, 20, 10);
		
		for(int i = 0; i < 10; i++) {
			char[][] canvass = newCanvass(20, 10);
			canvass = fillCanvass2(canvass, '*', ' ');
			printCanvass(canvass);
		
			Thread.sleep(500);
		
			canvass = fillCanvass2(canvass, '#', ' ');
			printCanvass(canvass);
		
			Thread.sleep(500);
		}
	
	}
	
	public static char mostFrequent (String input) {
	HashMap<Character,Integer> frequency = new HashMap<>();
	for (int i = 0; i < input.length(); i++) {
		char currentChar = input.charAt(i);
		if (! frequency.containsKey(currentChar)) {
			frequency.put(currentChar, 1);
		} else {
			int existingCount = frequency.get(currentChar);
			frequency.put(currentChar, existingCount + 1);
		}
		}
	 	Character highestFrequency = null;
	 	int highestFrequencyCount = 0;
		for(Entry<Character, Integer> entry : frequency.entrySet()) {
			Character currentChar = entry.getKey();
			int currentValue = entry.getValue();
			if (currentValue > highestFrequencyCount) {
			}
			System.out.printf("%s => %3d%n", currentChar, currentValue);
		}
		return ' ';
	}
	
	public static void drawCircle (int canvassX, int canvassY, int centerX, int centerY, int radius) {
		for (int i = 1; i <= canvassY; i++) {
			for (double j = 0.5; j <= canvassX; j += 0.5) {
				double rad = Math.sqrt((double)((i-centerY)*(i-centerY)+(j - centerX)*(j - centerX)));
				if(rad < radius) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	/**
	 * x by y array, full of single spaces
	 * @param x
	 * @param y
	 * @return
	 */
	public static char[][] newCanvass (int x, int y) {
		char[][] canvass = new char[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				canvass[i][j] = ' ';
			}
		}
		return canvass;
		
	}

	public static char[][] fillCanvass (char[][] canvass, char fill){
		int y = canvass.length;
		int x = canvass[0].length;
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				canvass[i][j] = fill;
			}
		}
		return canvass;
	}
	
	public static char[][] fillCanvass2 (char[][] canvass, char fill1, char fill2){
		int y = canvass.length;
		int x = canvass[0].length;
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if(j % 2 == 0) {
				canvass[i][j] = fill1;
				} else {
				canvass[i][j]= fill2;	
				}
			}
		}
		return canvass;
	}

	
	public static void printCanvass (char[][] canvass) {
		int y = canvass.length;
		int x = canvass[0].length;
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(canvass[i][j]);;
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
