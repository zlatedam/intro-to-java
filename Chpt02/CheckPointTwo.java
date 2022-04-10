// 2.8.2 

public class CheckPointTwo {
  public static void main(String [] arg) {

  // Step 1 declare a double variable named miles with an initial value of 100
  double miles = 100;

  // decare a double constant named KILOMETERS_PER_MILE with a value of 1.609
  final double KILOMETERS_PER_MILE = 1.609;

  // declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE and assign the result to kilometers 
  double kilometers = KILOMETERS_PER_MILE * miles;

  //display the output of kilometers in the console 
  System.out.println("kilometers = " + kilometers);

  }
}



