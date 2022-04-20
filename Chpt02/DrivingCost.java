import java.util.Scanner;

public class DrivingCost {
  public static void main(String [] args) {

  // Scanner & variables from driver 
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the driving distance");
  double distance = input.nextDouble();

  System.out.println("Enter miles per gallon");
  double efficiency = input.nextDouble();

  System.out.println("Enter the price per gallon");
  double price = input.nextDouble();

  // Compute the cost 
  double cost = (distance / efficiency) * price;

  // print results
  System.out.println("The cost of driving is " + "$"  + cost);

  }

}
