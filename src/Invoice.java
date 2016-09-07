import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Added exceptions for  later module
 */
public class Invoice {
	
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		int done = 0;
		//declare the array of a set size
		double myPrices[] = new double[100];
		double tax_rate = 0;
		try{
			System.out.println("What is the tax rate?");
			tax_rate = keyboard.nextDouble();
		} catch (Exception e) {
		    System.out.println("Something went wrong");
		    tax_rate = 6.0;
		}
		
		//counter
		int counter = 0;	
		do {
			try{
				System.out.print("Enter a price. Type 0.0 to end.");
				myPrices[counter] = keyboard.nextDouble();
			} catch  (InputMismatchException e) {
			    System.out.println("Invalid input... You must be done... ");	
			} catch (Exception e) {
			    System.out.println("Something else went wrong");
			}
			
			if(myPrices[counter] == 0){
				System.out.println("Caculating your total...");
				done = 1;
			}
			counter +=1;
		} while(done == 0);
		
		
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
