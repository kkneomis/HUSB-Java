import java.util.Scanner;

public class TaxCalc {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the customer ID");
		int customer_id = keyboard.nextInt();
		System.out.println("Enter the customer name");
		String name = keyboard.next();
		System.out.println("Enter the sales amount");
		double sales_amt = keyboard.nextDouble();
		System.out.println("Enter the tax code");
		String tax_code  = keyboard.next();
		
		double tax_pct = 0.0; 
		if (tax_code.equals("NRM")){
			tax_pct = 6.0;
		} else if (tax_code.equals("NPF")){
			tax_pct = 0.0;
		} else if (tax_code.equals("BIZ")){
			tax_pct = 4.5;
		}
		
		double total_amt_due = sales_amt + (sales_amt * tax_pct * .01);
		
		System.out.println("Customer ID: " + customer_id);
		System.out.println("Customer Name: " + name);
		System.out.println("Sales Amount: " + sales_amt);
		System.out.println("Tax Code: " + tax_code);
		System.out.println("Total Amount Due: " + total_amt_due);
		
	}

}
