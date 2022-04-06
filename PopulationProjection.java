//Exercise 1.11

import java.util.Scanner;

public class PopulationProjection {

  public static void main(String [] arg) {
  double SecondsYear, BirthYear, DeathYear, ImmigrantYear, currentPopulation;
  int years, currentPopulation = 312_032_486;   

 //Scanner for user to ask for how many years
 Scanner input = new Scanner(System.in);

 // Calculate how many seconds are in 1 year
  SecondsYear = 60 * 60 * 24 * 7 * 365;
  
  // How many births in a year
  BirthYear = SecondsYear / 7.0;
  
  //Calculate deaths per year
  DeathYear = SecondsYear / 13.0;

  // Calculate total immigrants in a year
  ImmigrantYear = SecondsYear / 45.0;

  years = input.nextInt();


  currentPopulation += (BirthYear + ImmigrantYear - DeathYear) * years;
 
  //Figure out the population in x years
  System.out.println("Population in" + years + "years is " + currentPopulation);


  }

}



