import java.util.Scanner;

public class MilesToFeet {
  public static void main(String [] args) {

  // Ask user to input value (in M) and store it as a double value
  System.out.println("Enter a value (m)");
  Scanner input = new Scanner(System.in);

  double meters = input.nextDouble();

  // Compute Metres to feet

  double feet = (meters * 3.2786);

  // Print the answer 
  System.out.println(meters + " meters" +  " is " + feet + " feet" );

  }
}


