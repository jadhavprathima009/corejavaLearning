package loopingStatements;

public class IFStatements {

	public static void main(String[] args) {
		
		//If statement:
		
		/*if (condition) {
		  block of code to be executed if the condition is true
	  			} */
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		
		
		
		// if else Statement:
		/*if (condition) {
  					block of code to be executed if the condition is true
		} else {
  				block of code to be executed if the condition is false
		}
		 */		
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//if else if
		/*
		 if (condition1) {
  					block of code to be executed if condition1 is true
		} else if (condition2) {
  					block of code to be executed if the condition1 is false and condition2 is true
		} else {
  					block of code to be executed if the condition1 is false and condition2 is false
		}
		 */
		int time1 = 22;
		if (time1 < 10) {
		  System.out.println("Good morning.");
		} else if (time1 < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		

	}

}
