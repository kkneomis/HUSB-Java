//mport java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int[]  numbers = new int[20];
		
		//counter
		int done = 0;
		int counter = 0;
		
		while(done == 0){
			System.out.print("Gimme a number. type 0 to end.");
			numbers[counter] = keyboard.nextInt();
			
			if(numbers[counter] == 0){
				System.out.println("Ok, sorting your stuff...");
				done = 1;
			}
			
			counter +=1;
		}//end while
					
		//sorting happens here
		for(int i = 0; i < numbers.length -1; i++){
			for(int j = 0; j < numbers.length -1; j++){
				if(numbers[j] > numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}//end if
			}//end j for
		}//end i for
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i]!= 0)
				System.out.print(numbers[i] + " ");
		}

	}//end main
	
}//end class
