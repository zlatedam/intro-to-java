import java.util.Scanner;

public class DigitsSum {
  public static void main(String [] args) {

  // Create scanner object
  Scanner input = new Scanner(System.in) 

  // Prompt user to enter a number between 0 - 1000)
  System.out.println("Enter a number between 0 - 1000");

  int number = input.nextInt();

  // Compute the sum of digits inside the integer

  int lessThan10 = number % 10;

