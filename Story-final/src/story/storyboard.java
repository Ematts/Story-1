package story;
import java.util.Scanner;
import java.util.Random;

public class storyboard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println("Who do you want to fight?");
	Scanner monster=new Scanner (System.in);
	String monsterAnswer = monster.next();
	String lower = monsterAnswer.toLowerCase();
	
	orc rotan = new orc();
	giant bruiser = new giant();
	dragon draco = new dragon();
		
		if (lower.equals("orc")) {
			rotan.total();
		
		}
			
		else if (lower.equals("giant")) {
			bruiser.total();
			
		}
		
		else if (lower.equals("dragon")) {
			draco.total();
		}
		else {
			System.out.println("You must fight orc, giant, or dragon.");
			
		}
			 }

}


