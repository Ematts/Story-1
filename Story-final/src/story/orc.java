package story;
import java.util.Random;

public class orc 
{
	static int hitPoints = 1;
	Random random = new Random(1);
	
	public static void total() {
		int damage;
		damage = (int) Math.round(Math.random()*1);
		int result = hitPoints - damage;
		System.out.println("You did " + damage + " damage");
		if(damage >= hitPoints) {
			System.out.println("You killed the orc!" );
		}
		else {
			System.out.println("The orc killed you!" );
			
		}
		
	}
	}
	
		
	
		


	
	


