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

    BufferedReader key = new BufferedReader(new InputStreamer(System.in));

    DecimalFormat df = new DecimalFormat("#,##0.00");

    // initializing variables

    double dblItemPrice =1;
    double dblTotalPrice = 0;

    // Set up while loop if the input is not 0 loop will continue
    while (dblItemPrice !=0){
        System.out.println("Enter the price for an item: ");
        dblItemPrice = Double.parseDouble(key.readLine());
        dblTotalPrice += dblItemPrice;
    }















  }
}