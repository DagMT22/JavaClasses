import java.util.Scanner;

public class Prompts {

	public static void main(String[] args) {
		
//		System.out.println("Give me 10 integers");
		Scanner input = new Scanner(System.in);
//		int[] numbers = new int[10];
//		for (int i = 0; i < 10; i++) {
//			numbers[i] = input.nextInt();
//		}
//		System.out.println("Total = " + sumInts(numbers));
//		System.out.println("Average = " + averageInts(numbers));

		
//		System.out.println("Array Size:");
//		int size = input.nextInt();
//		System.out.println("Interval:");
//		int interval = input.nextInt();
//		System.out.println("Array:");
//		printInts(makeArray(size, interval));
		
		//Would you rather get a penny doubled every day for 30 days, or $10,000 every day?
//		double pennies = 0.01;		
//		double tenGrand = 10000.00;
//		double tenGrandTotal = 10000;
//		int days = 30; 
//		System.out.println("                         Pennies    Ten Grand");
//		
//		for (int i = 1; i <= days; i++) {
//			System.out.printf("Day   %2d: ",i);
//			System.out.printf("$ %,18.2f ",pennies);
//			System.out.printf("$ %,12.2f",tenGrandTotal);
//			System.out.println();
//			pennies *= 2;
//			tenGrandTotal += tenGrand;			
//		}
		
		
		//drawHollowSquare(3);
		drawSquare(5);
		
		
		
	}

	
	/**
	 * Print array of integers
	 * @param ints
	 */
	public static void printInts(int[] ints) {
		for (int each : ints) {
				System.out.println(each);
		}
	}
	
	/**
	 * Sum array of integers
	 * @param ints
	 * @return
	 */
	public static int sumInts(int[] ints) {
		int sum = 0;
		for (int each : ints) {
			sum += each;
		}
		return sum;
	}
	
	/**
	 * Calculate average of array of integers
	 * @param ints
	 * @return
	 */
	public static double averageInts(int[] ints) {
		return (double)sumInts(ints) / ints.length;
	}
	
	/**
	 * return minimum in an array of integers
	 * @param ints
	 * @return
	 */
	public static int minInt(int[] ints) {
		int min = ints[0];
		for( int each : ints) {
			if ( each < min) {
				min = each;
			}
		}
		return min;
	}
	
	/**
	 * return max in an array of integers
	 * @param ints
	 * @return
	 */
	public static int maxInt (int[] ints) {
		int max = ints[0];
		for (int each : ints) {
			if (each > max) {
				max = each;
			}
		}
		return max;
	}
	
	/**
	 * make array using size, equally divisible by interval
	 * @param size
	 * @param interval
	 * @return
	 */
	public static int[] makeArray(int size, int interval) {
		int[] array = new int[size];
		int value = interval;
		for (int i = 0; i < size; i++) {
			array[i] = value;
			value += interval;
		}
		return array;
		
	}
	
	/**
	 * Exponential function
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int expInt(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}
	
	/**
	 * Draws hollow square with asterisks and spaces, using parameter size
	 * @param size
	 */
	public static void drawHollowSquare (int size) {
		// Draw Top
		for (int i = 0; i < size; i++) {
			System.out.print("* ");
		}
		System.out.println();
		//Draw Middle
		for(int i = 0; i < size -2; i++) {
			{System.out.print("* ");
		}
		for (int j = 0; j < size-2; j++) {
			System.out.print("  ");
		}
		System.out.println("* ");
		}
		//Draw Bottom
		if (size > 1) {
		for (int i = 0; i < size; i++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	public static void drawSquare (int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
}
