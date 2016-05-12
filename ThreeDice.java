
public class ThreeDice {
	
	private  Dice D1,D2,D3;
	
	public int Throw()
	{
		int randomDice;
		randomDice = (D1.Throw()+D2.Throw()+D3.Throw()) / 3;			
		return randomDice;
	}
	
	
	public String toString()
	{
		return String.format("D1 = %d\nD2 = %d\nD3 = %d", D1, D2, D3);
	}
}