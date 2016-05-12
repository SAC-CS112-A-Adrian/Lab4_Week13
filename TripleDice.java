
public class TripleDice extends Dice {

	
	@Override
	public int Throw()
	{
		int randomDice;
		randomDice = (super.Throw() + super.Throw() + super.Throw()) / 3;			
		return randomDice;
	}

}
