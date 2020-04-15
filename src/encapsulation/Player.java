package encapsulation;

public class Player 
{
	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
		
		if(this.health <= 0)
		{
			System.out.println("Player knock out");
			// Reduce number of lives remaining of the player
		}
	}
	
	public int healthRemaing()
	{
		return this.health;
	}
}
