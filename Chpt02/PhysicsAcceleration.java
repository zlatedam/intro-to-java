import java.util.Scanner;

public class PhysicsAcceleration { 
  public static void main(String args []) {

  // Scanner & User prompt
  Scanner input = new Scanner (System.in);
  System.out.println("Enter v0, v1, and t:");
  
  double vZero = input.nextDouble();
  double vOne = input.nextDouble();
  double time = input.nextDouble();
 
  // Calculation
  System.out.println("The average acceleration is " + (vOne - vZero) / time);

  }

}
