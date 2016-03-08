package story;
import java.util.Random;

public class orc 
{
	
	static int hitPoints = 5;
	static int random = (int)(Math.random() * 6);
	public Object total;
	
	public static void total() {
		int result;
		result = hitPoints - random;
		if(result < 5)
			System.out.println("You did " + result + " damage");
		else {
			System.out.println("You killed the orc");
			
		}
		
	}}
