import java.util.Scanner;

public class GiftAdvisor {
	
	/*
	 * Your task is to develop a program that will prompt the user for the recipient's gender. 
	 * You'll also ask for the giver's price range. Use high, medium or low.
	 * Now write a program that will select the perfect gift based on the table below.
	 *  Feel free to modify the gift list if you wish
	 */
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input gender (male/female)");
		String gender = sc.nextLine();
		
		System.out.println("input price (low/medium/high)");
		String price = sc.nextLine();
		
		//System.out.println(gender);
		
		System.out.println(get_gift(gender, price));
		
			
		
	}//end main
	
	
	public static String get_gift(String gender, String price){
		
		String situation = "";
		
		if(gender.equals("female")){
			//check female options
			situation +=1;
		} else {
			situation +=2;
		}
			
		if(price.equals("high")){
			//do something
			situation += 1;
		} else if (price.equals("medium")){
			//do something
			situation += 2;
		} else {
			//do something
			situation += 3;
		}
		
		int input = Integer.parseInt(situation);
		switch (input) {
			case 11: return "Get her: Jewelry, Weekend Getaway";
			case 12: return "Get her: Perfurme, Sweater";
			case 13: return "Get her: Wine, Selfie Stick";
			case 21: return "Get him: Smart TV, Apple watch";
			case 22: return "Get him: Guitar, Playstation";
			case 23: return "Get him: Books, Shoes";
			default: return "Get him/her a gift certificate.";
		}
		
	}//end get_gift

}//end class
