import java.util.Random;

public class GameNumberCreator implements ObjectCreator {
	
	//Random number arrange number limit
	private int upperbound ;
	//Random number created
	private int randomNumber;

	@Override
	public void create(Object object) {
		//Random number creation
		randomNumber = ((Random) object).nextInt(upperbound);
	}
	
	
	//Return of the random number
	public int getRandomNumber() {
		int returnNumber = this.randomNumber + 1;
		return returnNumber;
	}


	//Random number arrange number limit setter
	public void setUpperbound(int upperbound) {
		this.upperbound = upperbound;
	}

}
