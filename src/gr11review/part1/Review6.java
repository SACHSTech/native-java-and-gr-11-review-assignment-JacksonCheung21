package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
* A program that allows user to enter prices untill the user enters 0
* It will then calculate subtotal, tax  and dblTotalPrice
* @author: J. Cheung
*/

public class Review6{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    DecimalFormat df = new DecimalFormat("#,##0.00");

    // initializing variables

    double dblItemPrice = 1;
    double dblSubTotal = 0;
    double dblTax;
    double dblTotal;

    // Set up while loop if the input is not 0 loop will continue
    while (dblItemPrice != 0){
        System.out.print("Enter the price for an item: ");
        dblItemPrice = Double.parseDouble(key.readLine());
        dblSubTotal = dblItemPrice + dblSubTotal;
    }
    // Calculations

    dblTax = dblSubTotal * 0.13;
    dblTotal = dblSubTotal + dblTax;

    // printing out the subtotal, tax, and total using decimal format 
    System.out.println("Subtotal: $" + df.format(dblSubTotal));
    System.out.println("Tax: $" + df.format(dblTax));
    System.out.println("Total: $" + df.format(dblTotal));

  }
}