package gr11review.part1;
import java.io.*;

/**
* Program that calculates the existing amount after each year
* From yearly ammount + annual compiunt interest rates and outputs number of years
* @author: J, CHeung
*/



public class Review5{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Initializing variables
    double dblYearlyAmount = 0;
    double dblCompoundInterestRate = 0;
    dobule dblTargetAmount = 0;

    // Asking user to input yearly amount, the compound interest rate and target amount

    System.out.print("Enter the yearly invested amount: ");
    dblYearlyAmount = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    dblCompoundInterestRate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    dblTargetAmount = Double.parseDouble(key.readLine());







  }


}