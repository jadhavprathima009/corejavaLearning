package loopingStatements;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		// break statement can also be used to jump out of a loop
		// Used in switch statements more
		
		for (int i = 0; i <= 10; i++) {
			  if (i == 4) {
			    break;// printed only upto 3 next 4 dint print came out of the loop 
			  }
			  System.out.println(i);
			}
		
		System.out.println("--------------------------------------------------------");
		
		// continue statement breaks one iteration (in the loop)
		for (int j = 0; j <= 10; j++) {
			  if (j == 4) {
			    continue; // missed 4 and printed next i.e 5
			  }
			  System.out.println(j);
			}

	}

}
