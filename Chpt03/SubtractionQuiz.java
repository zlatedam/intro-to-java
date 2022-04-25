import java.util.Scanner;

public class SubtractionQuiz {
  public static void main(String [] args) {
  // Generate two random numbers using Math.random() and assign them to the integers
  int number1 = (int)(Math.random() * 10);
  int number2 = (int)(Math.random() * 10);

  if (number1 < number2) {
    int temp = number1;
    number1 = number2;
    number2 = temp;
    }
  // Prompt user to enter their answer 
  System.out.print
    ("What is " + number1 + " - " + number2 + "? ");
  Scanner input = new Scanner(System.in);
  int answer = input.nextInt();

  // Grade and display answer
  if (number1 - number2 == answer)
    System.out.println("You are correct!");
  else {
    System.out.println("Your answer is wrong.");
    System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
    }
  }
}
