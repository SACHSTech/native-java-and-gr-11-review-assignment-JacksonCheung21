package gr11review.part1;

import java.io.*;

/**
* Program that prints odd numbers from 20 to 100
* Prints numbers from 29 to 2 in a decreasing order
* @author: J. Cheung
*/

public class Review3 {
  public static void main(String[] args) throws IOException {

    // initialize variables
    int intCountOdd;
    int intCountDown;

    // print odd numbers from 20-100
    for(intCountOdd=20; intCountOdd < 100; intCountOdd++){
      if(intCountOdd %2 !=0){
        System.out.println(intCountOdd);
      }
    }
    // blank line 
    System.out.println("");

    // print numbers decreasing from 29-2
    for(intCountDown = 29; intCountDown >=2; intCountDown--){
      System.out.println(intCountDown);
    }
  } 
}