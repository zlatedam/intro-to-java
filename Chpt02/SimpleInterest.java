import java.util.Scanner;

public class SimpleInterest {
  public static void main(String [] args) {

  // Scanner class & saving it
  Scanner input = new Scanner(System.in);
  System.out.println("Enter balance and interest rate eg 3 for 3%");

  double balance = input.nextDouble();
  double annualInterest = input.nextDouble();

  // Calculate the interest rate based on the above input 
  System.out.println("The interest is " + balance * (annualInterest / 1200));


  }
}
