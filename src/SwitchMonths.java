import java.util.Scanner;

public class SwitchMonths {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        //This program will print 'May' when you run it.
		System.out.println("Enter the number of months");
        int month = sc.nextInt();
        
        String monthName;
        switch (month) {
            case 28:  monthName = "February";
                      break;
            case 30:  monthName = "April - June  - September - November";
                      break;
            case 31:  monthName = "January - March - May  - July - August  - October - December";
                      break;
            default:  monthName = "no months have exactly " + month + " days";
                      break;
        }
        System.out.println(monthName);
		
	}//end main
	
}//end class
