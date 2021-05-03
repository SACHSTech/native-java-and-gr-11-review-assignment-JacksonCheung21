package gr11review.part1;

import java.io.*;
import java.text.*;

/**
* A program that asks how many items they would want to purchase. 
* Which then will take the total price to print out total with tax
* @author: J. Cheung
*/

public class Review4{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");

    // initializing variables
    int intNumItems;
    int intCount;
    double dblPrice;
    double dblTax;
    double dblTotal;
    double dblSubtotal = 0;

    // Asking user input for the number of items
    System.out.print("How many items do you want to buy?");
    intNumItems = Integer.parseInt(key.readLine());

    // For loop that will continue going until user has inputted the price of items

    for (intCount = 1; intCount <= intNumItems; intCount++){
        System.out.print("Enter the price for item " +intCount+ ":");
        dblPrice += Double.parseDouble(key.readLine());
        dblSubtotal += dblPrice;
    }











  }
}