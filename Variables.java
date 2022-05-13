package basicConcepts;

public class Variables {
	//instance variable also called as object variables---- object level variables
	int a=10;
	String name = "prathima";

	// Keyword Static is used for the class level variables
	//Also called Static Variables
	//class level variables are accessed by the .  with the class name
	static int x=20;
	static String lastName="Jadhav";

	public static void main(String[] args) {
		
		//creating a new object for the class variables
		//Variables() here is default constructor
		Variables var = new Variables();
		
		// printing instance variables using object
		System.out.println(var.a);
		System.out.println(var.name);
		
		System.out.println("----------------------------------------");
		
		// Printing Class level Static variables using class name
		System.out.println(Variables.x);
		System.out.println(Variables.lastName);
		
		
		
		
		
		
		
		
	}

}
