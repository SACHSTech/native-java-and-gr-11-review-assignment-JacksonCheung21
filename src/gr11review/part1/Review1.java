package gr11review.part1;
import java.io.*;

/**
* A program that prints the day of the year from given inputs from the user
@author: J. Cheung
*/

public class Review2{

 public static void main(String[] args) throws IOException{
 
  // Buffered Reader
  BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

  // Initializing Variables
  int intMonth;
  int intDays;
  int intDayofYear;
  int intCount;
  int intTotal = 0;

  // User input for month and day
  System.out.print("Enter the month number: ");
  intMonth = Integer.parseInt(key.readLine());

  System.out.print("Enter the day number: ");
  intDays = Integer.parseInt(key.readLine());

  // Calculating for the amount of days and month intTotal
  for (intCount = 1; intCount < intMonth; intCount++){
    if (intCount == 2){
      intTotal += 28;
    }
    else if (intCount == 4 || intCount == 6 || intCount == 9 || intCount == 11){
      intTotal += 30; 
    }
    else {
      intTotal += 31;
    }

  }

  // Adding day number and month total to get # of day in the year
  intDayofYear = intTotal + intDays;

  // Result
  System.out.println(intDayofYear);
 }
}