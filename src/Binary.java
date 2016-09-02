import java.util.Scanner;

public class Binary {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		String input = keyboard.next();
		
		
		if(input.matches("[01]+"))
		{
		    System.out.println("This is a binary number");
		    //do binary stuff
		    binary_to_decimal(input);
		    
		}  else if(input.matches("[0123456789]+")) {
			System.out.println("This is a decimal number");
			//do decimal stuff
			decimal_to_binary(input);
		} else {
			System.out.println("This is not a number");
			//do nothing
		}
		
		
	}//end main

	public static void binary_to_decimal(String input){
		//we need the binary number to be in reverse so the values are accurate
		String reverse = new StringBuffer(input).reverse().toString();
		String binary_num = reverse;
				
		int length = binary_num.length();
		double sum = 0;
				
				
		for (int i = 0; i < length; i++) {
			//getting the digit value from string
			int digit = binary_num.charAt(i) - 48; 
					  
			//getting value of the binary place
			double value = Math.pow(2, i);
			//System.out.println("Value: " + value + " for: " + digit);
			sum += (digit * value);
		}//end for
				
		System.out.println("The decimal value of: " + input + " is "  + sum);		
		
	}//end binary_to_decimal
	
	
	public static void decimal_to_binary(String input){
		
		int number = Integer.parseInt(input);
		int remainder = 0;
		//int counter = 0;
		String binary_num = "";
		
		while(number > 0){
			remainder = number%2;
			number = number/2;
			//System.out.println("Answer: " + number);
			//System.out.println("Remainder: " + remainder);
			binary_num = remainder + binary_num;
		}
		
		System.out.println("The binary value of: " + input + " is "  + binary_num);	
		
	}//end decimal_to_binary
	
	
	
}//end class
