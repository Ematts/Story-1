package story;
import java.util.Random;

public class giant 
{
	static int hitPoints = 2;
	Random random = new Random(2);
	
	public static void total() {
		int damage;
		damage = (int) Math.round(Math.random()*2);
		int result = hitPoints - damage;
		System.out.println("You did " + damage + " damage");
		if(damage >= hitPoints) {
			System.out.println("You killed the giant!" );
		}
		else {
			System.out.println("The giant killed you!" );
			
		}
		
	}
	}
		
			

