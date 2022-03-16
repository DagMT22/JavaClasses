
public class App {

  public static void main(String[] args) {
    
    //create 2 of each variable and provide realistic values
    double itemPrice1 = 1.99;
    double itemPrice2 = 9.99;
    double moneyInWallet1 = 5.00;
    double moneyInWallet2 = 50.00;
    int numberOfFriends1 = 15;
    int numberOfFriends2 = 4;
    int age1 = 25;
    int age2 = 32;
    String firstName1 = "John";
    String firstName2 = "David";
    String lastName1 = "Smith";
    String lastName2 = "Wright";
    String middleInitial1 = "A";
    String middleInitial2 = "B";
    
    //a.    New amount of money in wallet after buying the item
    double leftInWallet1 = moneyInWallet1 - itemPrice1;
    double leftInWallet2 = moneyInWallet2 - itemPrice2;
    
    //b.    Number of friends you’ve made each year based on your age variable and your number of friends variable
    double friendsPerYear1 = (double)numberOfFriends1 / age1;
    double friendsPerYear2 = (double)numberOfFriends2 / age2;
    
    //c.  Full name based on first name, middle initial, and last name
    String fullName1 = firstName1 + " " + middleInitial1 + " " +lastName1;
    String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
    
    //print variables, with added details for context
    System.out.println("Remaining in wallet #1: $" + leftInWallet1);
    System.out.println("$" + leftInWallet2 + " left in wallet #2.");
    System.out.println("On average, my friends per year calculates to: " + friendsPerYear1);
    System.out.println("I've made " + friendsPerYear2 + " friends per year over the course of " + age2 + " years.");
    System.out.println("My name is " + fullName1 + ".");
    System.out.println("\"" + fullName2 + "\" is the name I used on this form.");
    

  }

}
