package project3;

public class fizzbuzz {

	public static void main(String[] args) {
		System.out.println("foo");
	}
	
	public static String convert(int number) {
		if(number == 1) {
			return "1";
		} else if (number == 2) {
			return "2";			
		} else {
			return "fizz";			
		}
	}

}
