import java.util.Scanner;

public class Invoice {
	
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		int done = 0;
		//declare the array of a set size
		double myPrices[] = new double[100];
		
		System.out.println("What is the tax rate?");
		double tax_rate = keyboard.nextDouble();
		
		//counter
		int counter = 0;
		while(done == 0){
			System.out.print("Enter a price. Type 0.0 to end.");
			myPrices[counter] = keyboard.nextDouble();
			
			if(myPrices[counter] == 0){
				System.out.println("Caculating your total...");
				done = 1;
			}
			counter +=1;
		}//end while
		System.out.println("\n -------------- \n");
		System.out.println("Receipt");
		//getting the total
		double total = 0;
		for(int i= 0; i < counter - 1; i++){
			System.out.println(myPrices[i]);
			total += myPrices[i];
		}//end for
		
		double tax = total * tax_rate * .01;
		
		System.out.println(total + "\t subtotal");
		System.out.println( tax + "\t tax");
		System.out.println(total + tax + "\t grand total");
		
	}//end main

}//end class
