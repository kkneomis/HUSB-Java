
public class Fibonacci {
	
	public static void main (String[] args){
		for(int i=1; i<20; i++){		
			System.out.print(recurse(i) + " ");
		}
				
	}//end main
	
	public static int recurse(int x){
		if(x == 1){
			return 1;
		} else if(x== 2){
			return 1;
		} else {
			int value = recurse(x-2) + recurse(x-1);
			return value;
		}
	}//end recurse
	
}//end class
