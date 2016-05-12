import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean again = true;

		TripleDice game = new TripleDice();
		
		while (again) {

			
			int diceRolled = game.Throw();
			
			System.out.print(diceRolled);
			
			System.out.printf("\nEnter 1 to play again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;

		}
	}
}