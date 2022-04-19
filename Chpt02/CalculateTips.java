import java.util.Scanner;

public class CalculateTips {
  public static void main(String [] args) { 

  // import scanner to ask user for subtotal and gratuity 
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the subtotal & gratuity rate:");

  // Store the values 
  double subtotal = input.nextDouble();
  
  double gratuityRate = input.nextDouble();

  // Compute the gratuity & subtotal
  
  double gratuity = subtotal * (gratuityRate / 100);
  double total = subtotal + gratuity;

  // Display results
  System.out.println("The gratuity is " + "$" + gratuity + " and the total is " + "$" + total);

  }

}




