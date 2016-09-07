import java.util.Scanner;
 
/*
 * Add Exception Handling to the following code to handle 
 * if the user tries to enter zero as the second integer.
 */

public class Division {
  public static void main(String[] args) {
 
  int a, b, result = 0;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
  
  a = input.nextInt();
  b = input.nextInt();
  
  
  try{
	  result = a / b;
  } catch(ArithmeticException e){
	  System.out.println("You can't put 0");
  } finally {
    System.out.println("finally block will execute.");
  }
  
  
  System.out.println("Result = " + result);
  
  }
}
