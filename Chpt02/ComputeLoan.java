import java.util.Scanner;
import java.util.Locale;
import java.util.Currency;

public class ComputeLoan {
  
  private static final int MONTHS_IN_A_YEAR = 12;

  public static void main(String [] args) {

  // Prompt user to enter the principal amount 
  System.out.println("Enter the principal loan amount");

  Scanner scanner = new Scanner(System.in);
  double principal = scanner.nextDouble();

  // Prompt user to enter the interest rate 
  System.out.println("Enter the interest rate e.g 0.04 for 4%");
  float annualInterestRate = scanner.nextFloat();

  // Prompt user to enter term of the loan in years 
  System.out.println("Enter the term in years");
  int termInYears = scanner.nextInt();

  // Calculate monthly interest rate from annual
  double monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;

  // Get number of payments (monthly)
  int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;

  // Compute the monthly payment amount 
  double monthlyPayment = principal * ((monthlyInterestRate) * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1);

  // Print out the result of above calculation
  System.out.println("Monthly payments are: " +  "$" +String.format("%.2f", monthlyPayment));

  }
}
