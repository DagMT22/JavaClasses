public class Week3Assignment {
  public static void main(String[] args) {
    
    //1. Create an array
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 97};
    
    //1.a Subtract first element from last element, and print
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    //1.b Add an age to the array and test that 1.a still works - added 97, and new result is 94.
    
    //1.c Use a loop to calculate the average age
    int sum = 0;
    for (int each : ages) {
      sum += each;
    }
    double average = (double)sum / ages.length;
    System.out.println(average);
    
    //2 Create a String array of names
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    //2.a Use a loop to calculate the average number of letters per name, and print
    int sumLength = 0;
    for (String each : names) {
      sumLength += each.length();
    }
    double averageLength = (double)sumLength / names.length;
    System.out.println(averageLength);
    
    //2.b Use a loop to concatenate all the names together, separated by spaces, and print
    String allNames = "";
    for (String each : names) {
      allNames = allNames + each + " ";
    }
    allNames = allNames.trim();   //Remove the trailing space that was added by the loop 
    System.out.println(allNames);
    
    //3 How do you access the last element of any array?
    // you can use array[array.length - 1]
    
    //4 How do you access the first element of any array?
    //Use index 0: array[0]

    //5 Create an int array nameLengths
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    
    //6 Calculate the sum of the elements in nameLengths array, then print
    int sumNameLength = 0;
    for (int each : nameLengths) {
      sumNameLength += each;
    }
    System.out.println(sumNameLength);
    
    //7 Write a method that takes a string "word" and int "n" and returns word concatenated with itself n times.
    System.out.println(repeatString("Hello" , 3));
    
    //8 Write a method that takes a firstName and lastName and returns a fullName
    System.out.println(fullName("Tom", "Sawyer"));
    
    //9 Write a method that returns true if the sum of the ints in the array is greater than 100
    System.out.println(sumGreaterThan100(nameLengths));
    
    //10 Write a method that takes an array of doubles and returns the average
    double[] test = {1.2, 5.00, 9.00};
    System.out.println(averageDouble(test));
    
    //11 Write a method that takes two arrays of double and returns true if the average of the first is greater than the 
    //average of the second
    double[] test2 = {3.0, 3.1, 3.2};
    System.out.println(averageDouble(test2));
    System.out.println(firstGreater(test, test2));
    
    //12 Write a method called willBuyDrink, that returns true if boolean isHotOutside = true,
    // and if double moneyInPocket > 10.50.
    System.out.println(willBuyDrink(true, 15.50));
    
    //13 Create a method
    // Print each String in an array of Strings - a shortcut to print without having to build a for loop
    printStrings(names);
    
    //Print each int in an array of ints
    printInts(ages);
  }
  
  /**
   * 7. Returns a String concatenated with itself n times
   * @param word  Input String
   * @param n  # of repeats
   * @return returns a String
   */
  public static String repeatString(String word, int n) {
    String repeated = "";
    for (int i = 0; i < n; i++) {
      repeated = repeated + word;
    }
    return repeated;
  }

  /**
   * 8. Returns a full name, from a first name and a last name, by concatenating with a space in between
   * @param firstName First Name, String
   * @param lastName Last Name, String
   * @return Full Name, String
   */
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  /**
   * 9. Takes an array of ints, and returns true if the sum is greater than 100
   * @param array Array of ints
   * @return True if sum > 100
   */
  public static boolean sumGreaterThan100 (int[] array) {
    int total = 0;
    for (int each : array) {
      total += each;
    }
    return total > 100;
  }
  
  
  /**
   * 10. Takes an array of doubles and returns the average
   * @param array type double array
   * @return type double, average of the elements of array
   */
  public static double averageDouble(double[] array) {
    double sum = 0;
    for (double each : array) {
      sum += each;
    }
    return sum / array.length;
    
  }
  
  /**
   * 11. Returns true if the average of array 1 is greater than the average of array 2
   * @param array1 type Double
   * @param array2 type Double
   * @return
   */
  public static boolean firstGreater(double[] array1, double[] array2) {
    return averageDouble(array1) > averageDouble(array2);
  }
  
  /**
   * 12. Returns true if it is hot outside and money in pocket is greater than 10.50
   * @param isHotOutside Boolean
   * @param moneyInPocket Double
   * @return Boolean
   */
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    return isHotOutside == true && moneyInPocket > 10.50;
  }
  
  /**
   * print each String in a String array, starting with an open bracket, separating each string with a comma and a new line,
   * and ending with a close bracket
   * @param array
   */
  public static void printStrings(String[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length -1) {
      System.out.print(",");
      } else {System.out.print("]");
      }
      System.out.println();
    }    
  }
  
  /**
   * print each Int in an int array, starting with an open bracket, separating each int with a comma and a new line,
   * and ending with a close bracket
   * @param array
   */
  public static void printInts(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length -1) {
      System.out.print(",");
      } else {System.out.print("]");
      }
      System.out.println();
    }    
  }
  
}
