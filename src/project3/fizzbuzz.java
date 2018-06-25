package project3;

public class fizzbuzz {

	public static void main(String[] args) {
		System.out.println("foo");
	}
	
	public static Object convert(int number) {
		// When we don't know the return datatype we can use
		// Object
		if(number % 3 == 0) {
			return "fizz";
		} else if (number % 5 == 0) {
			return "buzz";			
		} else {
			return number; 
		} 		
	}

}
