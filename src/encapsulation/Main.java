package encapsulation;

public class Main 
{
	public static void main(String[] arg)
	{
		Player player = new Player();
		
		player.name = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		
		player.loseHealth(damage);
		System.out.println("Remaining health =" + player.healthRemaing());
		
		damage = 11;
		
		player.loseHealth(damage);
		System.out.println("Remaining health =" + player.healthRemaing());
	}
}
