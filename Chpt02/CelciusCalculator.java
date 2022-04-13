import java.util.Scanner;

public class CelciusCalculator {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

  // Prompt user to input degree in fahrenheit 
  System.out.print("Enter a degree in fahrenheit");
  double fahrenheit = input.nextDouble();

  // Calculate fahrenheit to celcius following the equation
  double celcius = (5.0 / 9)  * (fahrenheit - 32);

  //Print the result
  System.out.println("Fahrenheit " + fahrenheit + " is " + celcius + " in celcius");

  }

}


