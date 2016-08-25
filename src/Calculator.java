import java.util.Scanner;

public class Calculator {
	
	/*
	 * 
	 * This programs takes a loan and calculates
	 * how much money is owed to the bank
	 * as well as the minimum monthly payment
	 * given the loan amount, interest rate, 
	 * and loan period
	 * 
	 * For example, if you got a loan of $10,000, 
	 * with an interest rate of 8% 
	 * paid over 5 years
	 * you would pay $12,165.84
	 * with a minimum monthly payment of $202.76
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		//how much money was borrowed
		double loan_amount = 0;
		//interest rate on the load
		double interest_rate = 0;
		//minimum monthly payment
		double mininum_payment = 0;
		//amount left to pay
		double balance = 0;
		//number of years to pay off the loan
		int payment_years;
		
		
		//Have user input the loan amount
		System.out.printf("Enter the loan amount: ");
		loan_amount = keyboard.nextDouble();
		
		//Have user input the interest rate
		System.out.printf("Enter the interest rate on the loan: ");
		interest_rate = keyboard.nextDouble();
		
		//Have user input the during of loan payment
		System.out.printf("Enter the term (in years) for the loan payment: ");
		payment_years = keyboard.nextInt();
		
		System.out.printf("\n================================================================\n");
		keyboard.close();

		//calculate the minimum monthly payment
		mininum_payment = calculatePayment(loan_amount, interest_rate, payment_years);
		
		//calculate the current balance owed to bank
		balance = -(mininum_payment * (payment_years * 12));
		
		//Print out the results
		System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank:", balance);
		System.out.format("%-30s$%-10.2f%n", "Minimum monthly payment:", mininum_payment);
	}

	public static double calculatePayment(double loan_amount, double interest_rate, int payment_years) {
		//this function calculates the minimum monthly payment
		double rate = (interest_rate / 100) / 12;
		double base = (rate + 1);
		
		//get the total number of months the loan in being paid off 
		int months = payment_years * 12;
		
		double minimum_montly_payment = 0.0;
		
		//calculate the minimum monthly payment
		minimum_montly_payment = loan_amount * (rate * (Math.pow(base, months)) / ((Math.pow(base, months)) - 1)); 
		
		return minimum_montly_payment;
	}
}