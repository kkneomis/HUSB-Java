import java.text.NumberFormat;
import java.util.Scanner;

public class MowingTime
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		//keep the rates as constants to make updates and changes easier
		final int lawnTimeRate= 2;
		final int lawnCostRate = 12 ;

		double yardLength, yardWidth, houseLength, houseWidth, lawnArea, lawnTimeHrs;

		System.out.print( "What is the yard length? " );
		yardLength = keyboard.nextDouble();

		System.out.print( "What is the yard width?" );
		yardWidth = keyboard.nextDouble();

		System.out.print( "What is the house length? " );
		houseLength = keyboard.nextDouble();

		System.out.print( "What is the house width?" );
		houseWidth = keyboard.nextDouble();

		lawnArea = (yardLength * yardWidth) - (houseLength * houseWidth); 

		//convert time from minutes to hours 
		lawnTimeHrs= (lawnArea * lawnTimeRate) / 60;

		System.out.println("The area of the lawn that needs to be mowed is " + lawnArea + " sq yar. It will take "+ lawnTimeHrs + 
		" hours to finish the mowing and will cost " + currency.format((float)(lawnTimeHrs * lawnCostRate)) + ".");
		System.out.println("If Bob charges $45 per hour, then the new cost will be: " + currency.format((float)(lawnTimeHrs * 45)));
		keyboard.close();
    }
}