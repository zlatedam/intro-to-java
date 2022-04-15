import java.util.Scanner;

public class ComputeChange {
  public static void main(String [] args) {

  //Create a scanner  
  Scanner input = new Scanner(System.in);

  // Prompt user for input on amount in double
  System.out.print("Enter an amount in double, eg 11.56");
  double amount = input.nextDouble();

  // Convert the amount into cents 
  int remainingAmount = (int) (amount * 100);

  // Convert the cents to dolloars 
  int numberOfDollars = (int) (remainingAmount / 100);
  
  // Find out how many dollars are remaining 
  remainingAmount = remainingAmount % 100;

  // Find the number of quarters 
  int numberOfQuarters = remainingAmount / 25;
  remainingAmount = remainingAmount % 25;

  // Find the number of dimes in the remaining amount
  int numberOfDimes = remainingAmount / 10;
  remainingAmount = remainingAmount % 10;

  // Find the number of nickels remaining 
  int numberOfNickels = remainingAmount / 5;
  remainingAmount = remainingAmount % 5;

  // Find the number of pennies 
  int numberOfPennies = remainingAmount;

  // Display the results 
  System.out.println("Your amount" + amount + "consits of");
  System.out.println(" " + numberOfDollars + " dollars");
  System.out.println(" " + numberOfQuarters + " quarters");
  System.out.println(" " + numberOfDimes + " Dimes");
  System.out.println(" " + numberOfNickels + " Nickels");
  System.out.println(" " + numberOfPennies + " Pennies");
  }
}
  
 
