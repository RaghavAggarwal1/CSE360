/**
* The AddingMaschine program is for CSE 360 class
* for practice with using a version control system.
* this one is executable for adding and subtracting integers.
* @author  Raghav Aggarwal, CSE 360 faculty and ASU faculty
* @version 1.0
* @since   2020-10-05
*/
package cse360assignment02;

//Making a class AddingMachine
public class AddingMachine {
	private int total;
	//string to record the history of transactions
	private String k = "";
	  
	//Meathod to add total
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    k = k + Integer.toString(total); //Adding transactions
	  }
	  
	  //Function to get value of total
	  public int getTotal () {
	    return total;	//returning current value of total
	  }
	  
	  //Function to add
	  public void add (int value) {
		  total = total + value; //adding to total
		  k = k + "+" + Integer.toString(value); //Adding transactions
	  }

	  //function to add
	  public void subtract (int value) {
		  total = total - value; //subtracting from total
		  k = k + "-" + Integer.toString(value); //Adding transactions
	  }
	  
	  
	  
	  //function to get string
	  public String toString () {
	    return k; //returning to string/history of transactions
	  }
	  
	  //function to clear screen
	  public void clear() {
		  //resetting values
		  total = -1;
		  k = null;
		  //clearing garbage
		  Runtime.getRuntime().gc(); 
		  
	  }
	  public static void main(String[] args){
		  //making an object of the class
	        AddingMachine myCalculator = new AddingMachine();
	        
	        //executing function from project description
	        //******Please add and delete executable functions from here if needed*****
	        myCalculator.add (4); 
	        myCalculator.subtract (2); 
	        myCalculator.add(5);
	        System. out. print(myCalculator.toString()+"\n"); 
	        System. out. print(myCalculator.getTotal()+"\n");
	        myCalculator.clear(); 
	        System. out. print(myCalculator.toString()+"\n"); 
	        System. out. print(myCalculator.getTotal()+"\n");
	     }
}