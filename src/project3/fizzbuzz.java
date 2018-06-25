package project3;

public class fizzbuzz {

	public static void main(String[] args) {
		System.out.println("foo");
	}
	
	public static Object convert(int number) {
		// When we don't know the return datatype we can use
		// Object
		if(number == 1) {
			return 1;
		} else if (number == 2) {
			return 2;			
		} else if (number == 4) {
			return 4; 
		} else {
			return "fizz";			
		}
	}

}



//public class Answer {
//	
//	int
//	
//	public Answer() {
//		int answer
//	}
//}