
public class Dice {
	
	protected int maximum;
	protected int numberOfThrows;
	private int diceRolled;
	
	public Dice ()
	{
		maximum = 6;
		numberOfThrows = 0;
	}
	
	public int Throw()
	{
		return ( 1 + (int) (Math.random() * 6) );
	}
	
	public int Throw (int dices, int bounces)
	{
		numberOfThrows++;
		int max = maximum * dices;
		return ( 1 + (int) (Math.random() * max) ) * bounces;
		
	}
	
	public int rollDice (int number)
	{
		numberOfThrows++;
		int max = maximum * number;
		diceRolled = ( number + (int) (Math.random() * max) );
		return diceRolled;
	}
	
	public void gamesLossWon(int loss, int won)
	{
		System.out.printf("Games loss: %d\nGames won: %d\n", loss, won);
		Integer.toString(loss, won);
	}
	
	public void numberThrows()
	{
		System.out.printf("Number of throws: %d\n", numberOfThrows);
	}
	
	public void history(int loss, int won)
	{
		System.out.printf("Number of throws: %d\n", numberOfThrows);
		System.out.printf("Games loss: %d\tGames won: %d\n", loss, won);
	}
	
	
}
