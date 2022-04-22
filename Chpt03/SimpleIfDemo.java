// Simple if statement program to see if the number is either divisible by 5 or 2, and printing that out

import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String [] args) {
  
  // Create scanner class & ask user to input an integer
  Scanner input = new Scanner(System.in);
  System.out.println("Enter an integer");

  int number = input.nextInt();

  if (number % 5 == 0)
    System.out.println("HiFive");


  if (number % 2 == 0);
    System.out.println("HiEven");

    }
}
