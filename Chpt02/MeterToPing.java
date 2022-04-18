import java.util.Scanner;

public class MeterToPing {
 public static void main(String [] args) { 

  // Scanner class to get user input
  Scanner input = new Scanner (System.in);

  System.out.println("Enter a number in square meters");

  double meters = input.nextDouble();

  // Compute meters to pings (1 square meter = 0.3025 ping)
  System.out.println(meters +  " meters" +  " is " +  (meters * 0.3025) + " pings");
  
  }
}
