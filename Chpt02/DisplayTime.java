import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  //Prompt user to input amount of seconds
  System.out.println(" Enter an integer for seconds ");
  int seconds = input.nextInt();
  
  int minutes = seconds / 60;
  int remainingSeconds = seconds % 60;
  // print out the remaining seconds from the integer the user has inputted earlier 
  System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");
  }

}
