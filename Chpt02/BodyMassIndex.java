import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String [] args) {


  // Prompt user to enter their weight in pounds & height in inches 
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter your weight in pounds");

  double firstWeight = input.nextDouble();

  System.out.println("Enter your height in inches");

  double firstInches = input.nextDouble();

  // transfer these imperial inputs to metric inputs 

  double metricWeight = 0.45359237 * firstWeight;

  double metricHeight = 0.0254 * firstInches;


  // Calculate BMI with these metric inputs 

  double bodyIndex = metricWeight / (metricHeight * metricHeight);

  // Print out the results

  System.out.println("Your BMI is: " + bodyIndex);

  }
}

