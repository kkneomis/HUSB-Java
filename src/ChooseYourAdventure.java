import java.util.Scanner;

public class ChooseYourAdventure {
	
	
	/*
	 * Title: Choose Your Adventure
	 * Author: Simeon Kakpovi
	 * A cute little game where the user
	 * gets various options during the phases
	 * of their adventures.
	 * 
	 * 
	 * 
	 */
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int running = 1;
		String action = "house";
		
		System.out.println("WELCOME TO SIMEON'S TINY ADVENTURE!");		
		
		//here are all the possible actions the user can take
		//at the end of each storyline running is set to 0
		while(running == 1){
			if(action.equals("house")){
				System.out.println("You are in a creepy house!  Would you like to go *upstairs* or into the *kitchen*?");
				action = choose("upstairs", "kitchen");
			}//end upstairs 
			
			if(action.equals("kitchen")){
				System.out.println("You go into the kitchen and there are two pills on the table.  Would you like to take the  *red pill* or the *blue pill*?");
				action = choose("red", "blue");
			}//end upstairs
			
			if(action.equals("upstairs")){
				System.out.println("You go upstairs and see a boogeyman.  Would you like to *run* or *fight* him?");
				action = choose("run", "fight");
			}//end upstairs
			
			if(action.equals("red")){
				System.out.println("The red pill turns out to be a molly.  Would you like to *sleep* or *keep going*?");
				action = choose("sleep", "go");
			}//end upstairs
			
			if(action.equals("blue")){
				System.out.println("You take the blue pill and get super swole.  Would you like to *become a bodybuilder* or *become a football player*?");
				action = choose("bodybuild", "football");
			}//end upstairs
			
			
			if(action.equals("fight")){
				System.out.println("You pick up a club and bash him on the head. But his mama shows up looking for revenge. Would you like to *fight her* or *run*?");
				action = choose("fightmama", "run");
			}//end upstairs
			
			if(action.equals("fightmama")){
				System.out.println("Mama boogeyman chases you around the house, but you find a chainsaw and rip her in half. All of a sudden papa boogeyman  appears! Would you like to *fight him* or *run*?");
				action = choose("fightpapa", "run");
			}//end upstairs
			
			if(action.equals("fightpapa")){
				System.out.println("Papa boogeyman rips off your head. You are an idiot. The end.");
				running = 0;
			}//end upstairs
			
			if(action.equals("run")){
				System.out.println("You run home and live a happy live. You are smart. The end.");
				running = 0;
			}//end upstairs
			
			if(action.equals("sleep")){
				System.out.println("You go to sleep. The next morning, you head home because you are thinking clearly. You are smart. The end.");
				running = 0;
			}//end upstairs
			
			if(action.equals("bodybuild")){
				System.out.println("You become fit and attract all the ladies/hunks. You live a sexy life forever. The end.");
				running = 0;
			}//end upstairs
			
			if(action.equals("football")){
				System.out.println("The get rich and win a superbowl but you get 10 concussions. You become slow for the rest of your life. The end.");
				running = 0;
			}//end upstairs
			
			if(action.equals("go")){
				System.out.println("You go upstairs high af and see a boogeyman.  Would you like to *hug* or *fight* him?");
				action = choose("hug", "fight");
			}//end upstairs
			
			
			if(action.equals("hug")){
				System.out.println("The boogeyman rips off your head. You are an idiot. The end.");
				running = 0;
			}//end upstairs
			
		}//end while 

	}//end main
	
	public static String choose(String choice_a, String choice_b){
		int valid = 0;
		String choice = "no choice";
		while(valid == 0){
			System.out.println("You can choose '" + choice_a + "' or '" + choice_b + "'");
			choice = keyboard.next();
			if((choice.equals(choice_a))||choice.equals(choice_b)){
				valid = 1;
			}
		}
		return choice;
	}//end choose method

}
