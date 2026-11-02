
public class Game {

	public static void main(String[] args) 
	{
		GameCharacter player1 = new GameCharacter("Hero", 100);
		GameCharacter player2 = new GameCharacter("Villian", 85);
		
		player1.attack();
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus());
		System.out.println(player2.getStatus());
		

	}

}
