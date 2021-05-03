package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
* A program that asks how many items they would want to purchase. 
* Which then will take the total price to print out total with tax
* @author: J. Cheung
*/

public class Review4{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("#,##0.00");

    // initializing variables
    int intNumItems = 0;
    int intCount;
    double dblPrice = 0;
    double dblSubtotal = 0;
    double dblTax;
    double dblTotal;

    // Asking user input for the number of items
    System.out.print("How many items do you want to buy? ");
    intNumItems = Integer.parseInt(key.readLine());

    // For loop that will continue going until user has inputted the price of items

    for (intCount = 1; intCount<intNumItems+1; intCount++){
        System.out.print("Enter the price for item " + intCount + ": ");
        dblPrice = Double.parseDouble(key.readLine());
        dblSubtotal = dblPrice + dblSubtotal;
    }

    // tax
    dblTax = dblSubtotal * 0.13;

    // total
    dblTotal = dblTax + dblSubtotal;

    //Print the subtotal, tax and total
    System.out.println("Subtotal: $" + df.format(dblSubtotal));
    System.out.println("Tax: $" + df.format(dblTax));
    System.out.println("Total: $" + df.format(dblTotal));

  }
}