package project3;

public class fizzbuzz {

	public static void main(String[] args) {
		for(int i = 1; i < 101; i++) 
			System.out.println(fizzbuzz.convert(i));
	}
	
	public static Object convert(int number) {
		// When we don't know the return datatype we can use
		// Object
		if(number % 15 == 0)
			return "fizzbuzz";
		else if(number % 3 == 0)
			return "fizz";
		else if (number % 5 == 0)
			return "buzz";			
		else
			return number; 
	}

}
