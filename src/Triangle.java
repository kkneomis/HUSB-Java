import java.util.Scanner;

public class Triangle {
	
	 public static void main( String[] args ) {
		 //boolean right = false;
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("What is the length of your first side?");
		 double a = scan.nextDouble();
		 System.out.println("What is the length of your second side?");
		 double b = scan.nextDouble();
		 System.out.println("What is the length of your third side?");
		 double c = scan.nextDouble();
		 
		 
		 //lets check if a2 + b2 = c2
		 if((a*a + b*b) == c*c)
			 System.out.println("This is a right triangle");
		 else
			 System.out.println("This is not a right triangle");
		 
	 }

}
