
package classexample;

/**
 *
 * @author sovathapann
 */
public class House {
    
public int yearBuilt = 2004;
public double floorArea = 100.05;
private double price = 20000;
private String condition = "Good" ;
    


public House() {
    }
//None default contructor floorArea;
public House(double floorArea){
    this.floorArea = floorArea;
    }
public House(int yearBuilt){
    this.yearBuilt = yearBuilt;
}

public double getprice(){
    return this.price;
    }

public void setprice(double newprice){
    this.price = newprice;
    }
 
public String getcondition(){
     return this.condition;
    }

public void setcondition(String newcondition){
    this.condition = newcondition;
    }

@Override
public String toString() {
    return
    "This House has " + floorArea + " Meter Square " + "." +
    "\nThis House was built in " + yearBuilt + "." +
    "\nThis House costs about $" + getprice() + "." +
    "\nThe condition of this house is " + getcondition() + ".";
}}

