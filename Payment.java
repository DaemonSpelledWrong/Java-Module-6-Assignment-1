/* CSC 119 Module 6 Assign. 1
* Damon Self
* May 7th, 2016 */

//Name of the class / file
public class Payment {
  private double priceperLB = 5.99;
  private double taxRate = .0725;
  private double bagsSold;
  private double bagWeight;
  //No-argument constructor
  Payment() {
    bagsSold = 1;
    bagWeight = 1;
  }
  //Constructor
  Payment(double bags, double weight) {
    bagsSold = bags;
    bagWeight = weight;
  }
  //Calculates salesprice
  public double getSale() {
    double salesprice = bagWeight * bagsSold * priceperLB;
    return salesprice;
  }
  //calculates salestax
  public double getSalesTax() {
    double salestax = getSale() * taxRate;
    return salestax;
  }
  //calculates totalprice
  public double getTotalPrice() {
    double totalprice = getSale() + getSalesTax();
    return totalprice;
  }
  //returns the value of price per LB
  public double getPrice() {
    return priceperLB;
  }
  //returns the rate of tax
  public double getTaxRate() {
    return taxRate;
  }

}
