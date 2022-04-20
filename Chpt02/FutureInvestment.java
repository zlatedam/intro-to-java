import java.util.Scanner;

public class FutureInvestment {
  public static void main(String [] args) {

  // new scanner input & double module for all variables
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the investment amount");

  double investmentAmount = input.nextDouble();

  System.out.println("Enter the annual interest rate in percent");

  double interestRate = input.nextDouble();

  System.out.println("Enter the number of years");

  double years = input.nextDouble();

  // calculate the future investment value 
  
  double monthlyRate = interestRate / 1200; 

  double futureInvestmentAmount = investmentAmount * Math.pow(1+ monthlyRate, years * 12);

  // print the result
  System.out.println("Future value is " + futureInvestmentAmount);

  }

}
