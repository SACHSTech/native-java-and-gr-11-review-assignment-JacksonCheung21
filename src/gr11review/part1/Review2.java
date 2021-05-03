package gr11review.part1;
import java.io.*;

/**
* program that prints out jokes according to user input
* If user input number dont match then print "Invalid menu option"
*@author: C.Jackson
*/

public class Review2{
 public static void main(String[] args) throws IOException{
  BufferedReader key = new Buffered(new InputStreamReader(System.in));

  // Initializing Variables
  int intMenuOption;

  // prints option from 0,1,2,3 
  System.out.println("0 - print a joke about your hair");
  System.out.println("1 - print a joke about your feet");
  System.out.println("2 - print a joke about your clothes");
  System.out.println("3 - print a joke about your teacher");
  System.out.print("Choose a menu option: ");

  // user input number 
  intMenuOption = Integer.parseInt(key.readLine());

 // switch/cases 
 switch (intMenuOption) { 
   case 0:
   // If the user input at intMenuOption is 0 it prints out joke about your hair
   System.out.println("Why do bees have sticky hair?");
   System.out.println("They always use honeycombs.");
   break;

   case 1:
   // If the user input at intMenuOption is 1 it prints out a joke about your feet
   System.out.println("Why do Canadian cowboys have sticky feet?");
   System.out.println("Maple Stirrups.");
   break;
   
   case 2:
   // If the user input at intMenuOption is 2 it prints out a joke about your clothes
   System.out.println("What is DNA's favourite piece of clothing?");
   System.out.println("(Jeans(genes)");
   break;
   
   case 3:
   // If the user input at intMenuOption is 3 it prints out a joke about  your teacher
   System.out.println("Why did the teacher wear sunglasses?");
   System.out.println("Because his class was so bright!");
   break; 

 }


 }
}
