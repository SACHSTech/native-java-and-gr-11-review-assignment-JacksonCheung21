package gr11review.part1;
import java.io.*;

/**
* Program that prints odd numbers from 20 to 100
* Prints numbers from 29 to 2 in a decreasing order
* @author: J. Cheung
*/

public class Review3{
 public static void main(String[] args) throws IOException{
   
   //initializing variables
   int intCount;
   int intCountdown;


  // Prints odd numbers from 20 to 100
  for (intCount = 20; intCount < 100; intCount++){
    if(intCount % 2 != 0) {
      System.out.println(intCount);
    }
  }

  





 }
}