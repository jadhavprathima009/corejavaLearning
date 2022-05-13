package basicConcepts;



public class CreatingAObject {
	
	
	//instance variable also called as object variables---- object level variables
	int a=10;

	public static void main(String[] args) {
		// Creating a Object
		
		// className Objectname= new Constructor(Default Constructor)
		
		
		CreatingAObject obj= new CreatingAObject();
		
		// calling an instance variable using object
		
		System.out.println(obj.a);
		
	}

}
