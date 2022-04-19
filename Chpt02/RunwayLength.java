import java.util.Scanner;
public class RunwayLength {
  public static void main(String [] args) {

  // Scanner method & inputs 
  Scanner input = new Scanner(System.in);

  System.out.println("Enter speed and acceleration");

  double speed = input.nextDouble();
  double acceleration = input.nextDouble();

  double length = (speed * speed) / (2 * acceleration);

  // Compute the landing area 
  System.out.printf("The minimum runway length for this airplane is %.2f\n", length);
  
  }
}
