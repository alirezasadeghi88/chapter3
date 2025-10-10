import java.util.Scanner;

public class ThreeQuiz {
	public static void main(String[] args) {
	
	
	int numbre1 = (int)(Math.random() * 100 );
	int numbre2 = (int)(Math.random() * 100 );
	int numbre3 = (int)(Math.random() * 100 );
	
	if (numbre1 < numbre2 ) {
		int temp = number1;
		number1 = number2;
		temp = number2;
		
	}	
	if (numbre1 < numbre3) {
		int temp = number2;
		number2 = number3;
		temp = number3;
	
	}
	
	System.out.print
		("What is" + number1 + " + " + number2 + " + " + numbre3 + " ? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
	if (number1 + number2 == answer)
		System.out.println("You are correct!");
		
	if (number1 + number3 == answer)
		System.out.println("You are correct!");
	
    else if {
	    System.out.println("Your answer is wrong. ");
		System.out.println(number1 + " + " + number2 +
			"should be" + (number1 + number2));
	}	
 	 else if {
	    System.out.println("Your answer is wrong. ");
		System.out.println(number2 + " + " + number3 +
		"should be" + (number2+ number3));
	}	
	}
}