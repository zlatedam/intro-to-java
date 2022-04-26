import java.util.Scanner;

public class ComputeTax {
  public static void main(String [] args) {
  // Create a scanner
  Scanner input = new Scanner(System.in);

  // Prompt user to enter their filing status 
  System.out.print("(0 - Single filer, 1 - Married jointly or qualifying widow, 2 - Married separately, 3 - head of household) Enter the filing status: ");

  int status = input.nextInt();

  // Prompt user to enter their total taxable income 
  System.out.println("Enter the total taxable income for the year");
  double income = input.nextDouble();

  // Compute tax 
  double tax = 0;
  
  if (status == 0) {
    if (income <= 8350)
    tax = income * 0.10;
   






