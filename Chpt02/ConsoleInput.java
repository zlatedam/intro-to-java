// Exercise 2.2 ComputeAreaWithConsoleInput.java// 

// Import the scanner object
import java.util.Scanner;

public class ConsoleInput {
  public static void main(String [] args) {
  
  // Create a scanner object
  Scanner input = new Scanner (System.in);
  
  // Prompt the user to enter an input for the radius 
  double radius = input.nextDouble();

  // Compute the are
  double area = radius * radius * 3.14159;

  // Display results 
  System.out.println("The area for the circle of radius" + radius +  "is" + area);

  } 

}




