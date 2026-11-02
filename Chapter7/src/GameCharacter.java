
public class GameCharacter {

		//Declare Instance Veriables
		private String name;
		private int health;
	
		
		//Default Constructor
		public GameCharacter()
		{
			name = null;
			health = 0;
		}
		
		//Overload Constructor
		public GameCharacter(String charName, int starHealth)
		{
			name = charName;
			health = starHealth;
	}
		public void attack()
		{
			System.out.println(name + "attacks! deals 10 damage. ");
		}
		
		public void takeDamage(int damage)
		{
			health = health - damage;
			if(health < 0)
			{
				health = 0;
			}
			System.out.println(name + " 's health is now"+ health);
		}
		
		public String getStatus()
		{
			return name + " has " + health + "health.";
		}
	
	
	}

