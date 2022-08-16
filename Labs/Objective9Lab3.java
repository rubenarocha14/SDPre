import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    while(true){
      printMenu();
      int selection = scanner.nextInt();
      if (selection == 1){
        System.out.println("Hello, Human");
      }
      else if(selection == 2){
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if(selection == 3){
        System.out.println("Goodbye.");
        break;
      }
      else{
        System.out.println("Please enter a vaild entry.");
      }
      /*
      Create a file called Objective9Lab3.java in the SDPre/Labs directory.
Write code in the commented areas of the while loop in the Starter Code that would print out the menu with the provided printMenu() method.
Take a user's input
Depending on the users choice, print out the correct message
Look back at your logic from Objective7Lab5

      */
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
