package story;
import java.util.Random;

public class dragon 
{
	static int hitPoints = 3;
	Random random = new Random(3);
	
	public static void total() {
		int damage;
		damage = (int) Math.round(Math.random()*3);
		int result = hitPoints - damage;
		System.out.println("You did " + damage + " damage");
		if(damage >= hitPoints) {
			System.out.println("You killed the dragon!" );
		}
		else {
			System.out.println("The dragon killed you!" );
			
		}
		
	}
	}