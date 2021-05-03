package gr11review.part1;
import java.io.*;

/**
* This program stiumlates 1000 pulls of a slot machine
* 3 Random numbers between 0-8 are created each pull
* It will then print out how many times a triple was pulled
* @Author: J. Cheung
*/

public class Review8{
  public static void main(String[] args) throws IOException {
  
  BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

  // initializing variables

  int intslot1;
  int intslot2;
  int intslot3;
  int intCount;
  int intTriple = 0;

  // Genearing loop that will continue until the count goes to 1000

  for (intCount = 0; intCount < 1000; intCount++){

    // this will generate random numbers from 1 to 8
    intslot1 = (int)(Math.random()*8+1);
    intslot2 = (int)(Math.random()*8+1);
    intslot3 = (int)(Math.random()*8+1);

    System.out.print(intslot1 + " ");
    System.out.print(intslot2 + " ");
    System.out.println(intslot3);

    // Seeing if any triple been pulled

    if (intslot1 == intslot2 && intslot1 == intslot3){
      intTriple++;
    }

  }
    System.out.println(intTriple);


  } 
}