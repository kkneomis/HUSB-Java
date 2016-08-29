import java.util.Random;

public class DiceRoller
 {
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random();
        
        dienumber =  1 + rnd.nextInt(5);
        
        System.out.println("Your die roll was : " + dienumber);
    }
 }