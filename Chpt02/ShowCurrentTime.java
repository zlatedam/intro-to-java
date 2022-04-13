public class ShowCurrentTime {
  public static void main(String [] args) {

  // Obtain time since linux epoch
  long totalMilliseconds = System.currentTimeMillis();
  
  // Translate this into seconds 
  long totalSeconds = totalMilliseconds / 1000;

  // Compute current second from totalSeconds
  long currentSeconds = totalSeconds % 60;

  // Obtain the total minutes 
  long totalMinutes = totalSeconds / 60;

  // Compute the current minutes 
  long currentMinutes = totalMinutes % 60;

  // obtain totalHours
  long totalHours = totalMinutes / 60;

  // Compute current hour from total hours 
  long currentHour = totalHours % 24;
  
  // Display the current time in GMT 

  System.out.println("The current time is " + currentHour + ":" +  currentMinutes + ":" + currentSeconds + " in GMT");

  }

}

