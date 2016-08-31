import java.util.Random;

public class Monopoly
 {
    public static void main( String[] args )
    {
    	int doubles_count = 0;
        int i = 1;
        while(i != 0){
        	int number_a = roll(); 
            int number_b = roll(); 
        	System.out.println("User rolls: " + number_a +  " & " + number_b );
        	int sum = number_a + number_b;
        	if(number_a == number_b){
        		System.out.println("DOUBLES!");
        		System.out.println("Move " + sum + " Spaces and roll again");
        		doubles_count++;
        	} else {
        		System.out.println("Move " + sum + " Spaces and stop");
        		i = 0;
        	}
        	
        	if(doubles_count == 3){
        		System.out.print("GO TO JAIL --->");
        		i = 0;
        	}
        		
        	
        }
    }
    
    public static int roll(){
    	int dienumber;
        Random rnd = new Random();
        
        dienumber =  1 + rnd.nextInt(5);
        return dienumber;
    }
 }