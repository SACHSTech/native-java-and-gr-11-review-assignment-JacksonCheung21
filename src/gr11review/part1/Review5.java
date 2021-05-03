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
    int intYear = 0;
    double dblTotalMoney = 0;
    double dblTargetAmount;
    double dblCompoundInterestRate;
    double dblYearlyAmount;
   

    // Asking user to input yearly amount, the compound interest rate and target amount

    System.out.print("Enter the yearly invested amount: ");
    dblYearlyAmount = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    dblCompoundInterestRate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    dblTargetAmount = Double.parseDouble(key.readLine());

    // While loop to run as long as the total money is less than the aimed amount
    while (dblTotalMoney < dblTargetAmount){
      dblTotalMoney += dblYearlyAmount;
      dblTotalMoney += (dblTotalMoney * (dblCompoundInterestRate / 100));
      intYear++;
    }

    // printing out the result 

    System.out.println("The target amount will be earned in " + intYear + " years.");

  }
}