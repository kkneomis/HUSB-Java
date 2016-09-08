
public class Fibonacci {
	/*
	 * Fibonacci and Collatz
	 */
	
	public static void main (String[] args){
		for(int i=1; i<20; i++){		
			System.out.print(fibonacci(i) + " \n");
		}
		
		System.out.println(collatz(233444));
				
	}//end main
	
	public static int fibonacci(int x){
		if(x == 1){
			return 1;
		} else if(x== 2){
			return 1;
		} else {
			int value = fibonacci(x-2) + fibonacci(x-1);
			return value;
		}
	}//end fibonacci
	
	
	public static int collatz(int x){
		
		if (x == 1 ){
			return x;
		} else if(x%2 == 0){
			return collatz(x/2);
		} else {
			return collatz((x * 3)+1);
		}
		
	}//end collatz
	
}//end class
