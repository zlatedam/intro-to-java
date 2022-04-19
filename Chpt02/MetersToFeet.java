import java.util.Scanner;

public class MetersToFeet {
  public static void main(String [] args) {

  // Scanner method for user to enter a value (in m)
  Scanner input = new Scanner (System.in);
 
  System.out.println("Enter a value in m");
  
  double meters = input.nextDouble();

  // Compute meters to feet 
  System.out.println(meters + " meters" +  " is " + (meters * 3.2786) + " feet");


  }

}
