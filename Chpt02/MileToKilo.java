import java.util.Scanner;

public class MileToKilo {
  public static void main(String [] args) {
   
  // Create a new scanner and ask for miles
  Scanner input = new Scanner(System.in);
  System.out.println("Enter miles:");

  // Record the answer 
  double miles = input.nextDouble();

  // Create double for kilometeres and transfer miles to km
  double kilometers = miles * 1.6;

  // print the answer
  System.out.println(miles + " Miles " + "is " + kilometers + " kilometers");

  }
}
