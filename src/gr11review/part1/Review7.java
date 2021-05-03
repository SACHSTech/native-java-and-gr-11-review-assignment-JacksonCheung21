package gr11review.part1;

import java.io*;

/**
* This program asks user to input a sentence
* It will then count the # of characters, including spaces and "a"s in a sentence
* It will also insert a dash for every odd numbered charater in a sentence
* @author: J.Cheung
*/

public class Review7{
  public static void main(String[] args) throw IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //initializing variables
    String strSentence;
    int intCharacters;
    int intSpaces = 0;
    int intLetterA = 0;
    int intCount;
    String strDashes = "";

    // Asking user for input (sentence)
    strSentence = key.readLine();

    //used to count number of letters in sentence
    intCharacters = strSentence.length();

    for (intCount = 0; intCount < intCharacters; intCount++){
      // finding each single charcter from the sentence to put into the char variables
      char chrCharacter = strSentence.charAt(intCount);
      if (chrCharacter == " "){
        intSpaces++;
      }
      else if(chrCharacter == 'a'){
        intLetterA++;
      }

      // check if letter is odd or not

      if ((intCount+1) % 2 != 0){
        strDashes += "-";
      }

      // printint out how many characters, how many spaces, letter a in the sentence
      // as well as the dashes

      System.out.println("There are " + chrCharacter + " characters in the sentence.");
      System.out.println("There are " + intSpaces + " spaces in the sentence.");
      System.out.println("There are " + intLetterA + "letter a in the sentence.");
      System.out.println(strDashes);

    }
  }
}