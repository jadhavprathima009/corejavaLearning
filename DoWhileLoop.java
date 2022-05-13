package loopingStatements;

public class DoWhileLoop {
	
	public static void main(String arg[]) {
		
		/*
		 do {
  				code block to be executed
			}
			while (condition);
		 */
		
		// Do while loop is used if the block of statements have to be executed ATLEAST ONCE even if the condition is false
		
		// to print 0 to 5 numbers
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i <= 5);
		
		System.out.println("-----------------------------------------------------------");
		
		// prints once even if the condition is wrong
		int j = 0;
		do {
		  System.out.println(j);
		  j++;
		}
		while (j > 5);
		
	}
	

}
