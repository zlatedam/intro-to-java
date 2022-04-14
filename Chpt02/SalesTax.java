import java.util.Scanner;

public class SalesTax {
  public static void main(String [] args) {

  // Scanner input
  Scanner input = new Scanner(System.in);

  // Prompt user for purchase price / variable for purchase amount 
 
  System.out.println("Enter purchase amount");
  double purchaseAmount = input.nextDouble();

  // tax amount and calculating tax on input above
  double tax = purchaseAmount * 0.06;
  System.out.println("Sales tax is $" + (int) (tax * 100) / 100);

  }

}

