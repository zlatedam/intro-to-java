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
    else if (income <= 33950)
      tax = 8350 * 0.10 + (income - 8350) * 0.15;
    else if (income <= 82250)
      tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
    else if (income <= 171550)
      tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + 
      (income - 82250) * 0.28;
    else if (income <= 372950)
      tax = 8350 * 0.150 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
      (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
    else
      tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
      (82250 - 33950) * 0.25 (171550 - 82250) * 0.28 +
      (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
      }

  }
}






