import java.util.Scanner;

public class CalculatingEnergy {
  public static void main(String [] args) {

  // Prompt user for input, scanner method
  Scanner input = new Scanner(System.in);
  
  System.out.printf("Enter the amount of water in kilograms");
  
  double water = input.nextDouble();

  System.out.printf("Enter the initial water temperature");
  
  double initialTemp = input.nextDouble();

  System.out.printf("Enter the final temperature");

  double finalTemp = input.nextDouble();

  
  // Calculation Q = M * (Finaltemp - initialtemp) * 4194

  System.out.println("The energy needed is " + water * (finalTemp - initialTemp) * 4184);


  }
}

