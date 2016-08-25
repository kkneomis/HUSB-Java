import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		
		int sum = num1 + num2;
		int product = num1 * num2;
		double average = (num1+num2)/2;
		String appendix = "";
		
		if (sum > 200){
			appendix = "*";
		}
		
		System.out.println("Sum: " + sum + appendix);
		System.out.println("Product: " + product);
		System.out.println("Average: " + average);
		
	}
}