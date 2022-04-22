import java.util.Scanner;

public class Checkpoint_3_3_1 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter an integer for 'x'");
  double x = input.nextDouble();
  System.out.println("Enter an integer for 'y'");
  double y = input.nextDouble();  

  // If statement 
  if (y>0) {
  x = 1;
  }
  
  // Printing the value of x 
  System.out.println("x = " + x);

  }
}
