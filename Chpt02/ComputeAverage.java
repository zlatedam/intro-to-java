import java.util.Scanner;

public class ComputeAverage {
  public static void main(String[] args) {

  // Scanner object for numbers to get average of 
  Scanner input = new Scanner(System.in);

  // Prompt the user for the numbers
  System.out.print("Enter Three numbers");

  double number1 = input.nextDouble();
  double number2 = input.nextDouble();
  double number3 = input.nextDouble();

  // Compute the average of the three numbers 
  double average = (number1 + number2 + number3) / 3;


  // Display the results for the average 
  System.out.println("The average of" + number1 + " " + number2 + " " + number3 + " is " +  average );

  }
 }
