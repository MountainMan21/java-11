package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObjects;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	private GameObjects[] objects = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		String[] status = { "lose", "draw", "win" };

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int wins = 0;

		for (int i = 0; i < 3; i++) {
			GameObjects obj1 = objects[random.nextInt(objects.length)];

			System.out.println("Choose an object.");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.print("> ");

			int objectIndex = scanner.nextInt();
			GameObjects obj2 = objects[objectIndex - 1];

			System.out.println("You chose: " + obj2);
			System.out.println("The computer chose: " + obj1);

			int comparison = obj2.compareTo(obj1);
			System.out.println(status[comparison + 1]);

			wins += comparison;

			System.out.println("\n");
		}

		scanner.close();
		System.out.println();

		if (wins > 0) {
			System.out.println("You have won! :  "+ wins);
		} else if (wins < 0) {
			System.out.println("You have lost! :  "+ wins);
		} else {
			System.out.println("It's a draw! :  " +  wins);
		}
	}
}