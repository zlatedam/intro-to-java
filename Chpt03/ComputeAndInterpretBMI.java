import java.util.Scanner;

public class ComputeAndInterpretBMI {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    // Create prompt for user to enter their weight in pounds
    System.out.println("Enter your weight in pounds");
    double weight = input.nextDouble();
    
    // Prompt the user to enter their height in inches
    System.out.println("Enter your height in inches");
    double height = input.nextDouble();

    // Set constants for metric measurements

    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    // Compute the BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    // Display results 
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
      System.out.println("You are underweight");
    else if (bmi < 25)
      System.out.println("You are at a normal weight");
    else if (bmi < 30)
      System.out.println("You are overweight");
    else 
      System.out.println("You are obese");
  }
}
