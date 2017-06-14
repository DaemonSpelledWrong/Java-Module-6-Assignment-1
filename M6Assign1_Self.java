/* CSC 119 Module 6 Assign. 1
* Damon Self
* May 7th, 2016 */

import java.util.Scanner;
import java.util.Date;
import java.text.DecimalFormat;
public class M6Assign1_Self
{
  //Declare variables
  static double bagsSold;
  static double bagWeight;
  static Payment myPayment;
  static Date dt;
  static String ready;
  static Scanner input;
  static DecimalFormat numberFormat;
  public static void main(String args[])
  {
    //Main method
    myPayment = new Payment();
    dt = new Date();
    input = new Scanner(System.in);
    ready = null;
    numberFormat = new DecimalFormat("#.00");
    //Prints user greeting messages
    outputGreeting();
    //Prompts whether or not the user wants begin
    isUserReady();
    //Loop for calculations, methods use Payment class
    while (ready.equalsIgnoreCase("Y"))
    {
      //Recieves input of bag count
      getBagsFromUser();
      //Recieves input of weight per bag
      getWeightFromUser();
      //Prints all calculations with 2 decimal format
      outputResults();
      //Prompts for additional sales
      isUserStillReady();

    }
    //Outputs farewell and thanks user
    outputFarewell();
  }
  //Greeting method
  public static void outputGreeting() {
    System.out.println("Welcome to the Coffee Sales Tracker.");
    System.out.println("This program will calculate the amount due");
    System.out.println("for your coffee sales transactions.");
  }
  //Prompt for readiness
  public static void isUserReady() {
    System.out.println("Are you ready to begin? Y/N: ");
    ready = input.next();
  }
  //Prompt for additional computation
  public static void isUserStillReady() {
    System.out.println("Do you have another sale to ring up? Y/N: ");
    ready = input.next();
  }
  //Get bag amount
  public static void getBagsFromUser() {
    System.out.println("How many bags of coffee do you want?");
    bagsSold = input.nextDouble();
  }
  //Get weight of bags
  public static void getWeightFromUser() {
    System.out.println("What is the weight, in pounds, of each coffee bag?");
    bagWeight = input.nextDouble();
  }
  //Print the results of all calculations
  public static void outputResults() {
    dt = new Date();
    myPayment = new Payment(bagsSold, bagWeight);
    System.out.println("Today's date: " + dt);
    System.out.println("Number of bags: " + bagsSold);
    System.out.println("Weight per bag: " + bagWeight);
    System.out.println("Price per pound: " + numberFormat.format(myPayment.getPrice()));
    System.out.println("Sales Tax: " + numberFormat.format(myPayment.getTaxRate()));
    System.out.println("Sales sub-total: " + numberFormat.format(myPayment.getSale()));
    System.out.println("Total tax: " + numberFormat.format(myPayment.getSalesTax()));
    System.out.println("Total Sale: " + numberFormat.format(myPayment.getTotalPrice()));
  }
  //Print farewell / thank you message
  public static void outputFarewell() {
    System.out.println("Your sales have been calculated, thank you for using the");
    System.out.println("Coffee Sales Tracker! Goodbye.");
  }
}
