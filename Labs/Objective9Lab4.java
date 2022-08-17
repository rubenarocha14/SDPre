import java.util.Scanner;

public class Objective9Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;

    System.out.print("Please give me a number: ");
		num1 = kb.nextDouble();
		System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    kb.close();
  }
  public static double findAverage(double x, double y) {
    double average = (x+y)/2;
    return average;

  }
}
  /*
  Write/define the "findAverage" method here
  Create a file called Objective9Lab4.java in the SDPre/Labs directory.
Using the Starter Code below, add code to the commented areas that would:
Take two numbers of type double and return the average.
Print out the results.
Hint: Make sure the return type of findAverage matches the data type of average

  */
