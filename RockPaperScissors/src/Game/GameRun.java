package Game;
import java.util.Scanner;
import java.util.Random;
import Game.Objects.Gameobjects;
import Game.Objects.Paper;
import Game.Objects.Rock;
import Game.Objects.Scissors;
public class GameRun {
	
private	 Gameobjects [] game =  {new Rock(),new Scissors(),new Paper()};
	
       	

	public void Run() {
		String [] result = {"lose","draw","win"};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int wins = 0;
		
		for(int i=0;i<3;i++) {
		Gameobjects object1 = game[random.nextInt(game.length)];
		
		System.out.println("You can choose any of the three choices :   ");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		System.out.print("> ");
		
		int objectIndex = scanner.nextInt();
		Gameobjects object2 = game[objectIndex - 1];
		
		
		System.out.println("You choose: " + object2);
		System.out.println("The Computer choose: " + object1);
		
		int comparision = object2.compareTo(object1);
		System.out.println(result[comparision+1]);
		wins+=comparision;
		System.out.println();
		System.out.println();
		}
		
		scanner.close();
		
		System.out.println();
		
		if (wins > 0 ) {
			System.out.println("you have won. ");
			
		}
		else if ( wins < 0) {
			System.out.println("you have lost. ");
		}
		else{
			
			System.out.println("Its a draw");
			
		}
		
		
	}
}
