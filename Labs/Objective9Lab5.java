/*Create a file called Objective9Lab5.java in the SDPre/Labs
directory.
Using the Starter Code below, add code to the commented
areas that would:
Prompt the user for two numbers, both of type double (Parts 1 & 2)
Using a switch, compare the user's choice to the
different functions provided by these methods (Part 3):
findSum
findAverage
calcTax
Not a method, but include an option to Quit.
Define the findAverage method (Part 4)
Hint: Refer to your logic from Objective9Lab4
Define the calcTax method (Part 5)
Hint: Use a tax rate of 8.31%
Hint: No need for a grand total, just the expected amount
from taxes.
Refer to the Expected Output section for clarification.
Because there are so many parts to this, the directives are
 written in the Starter Code below as comments.
*/

import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.println("Please enter your first number");
    num1 = kb.nextInt();




    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.println("Please enter your second number");
    num2 = kb.nextInt();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      case 1:
        System.out.println("Adding values");
        findSum(num1, num2);
      case 2:
        System.out.println("Finding average of values");
        findAverage(num1, num2);
      case 3:
        System.out.println("Calculating the tax");
        calcTax(num1, num2);
      case 4:
        System.out.println("Goodbye!");
        break;
      case 5:
        System.out.println("Please enter a valid entry");

		}
		kb.close();

	}
}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
    System.out.println(sum);
		return sum;
	}
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  public static double findAverage(double x, double y) {
    double average = (x+y)/2;
    System.out.println(average);
    return average;
  }

	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  public static double calcTax(double x, double y) {
    double tax = findSum(x, y)*0.0831;
    System.out.println(tax);
    return tax;
  }
}
