import java.util.Random;

public class GameNumberCreator implements ObjectCreator {

	//Random number created
	private int randomNumber = 0;

	@Override
	public void createObject(Object object) {
		//Random number creation
		randomNumber = ((Random) object).nextInt(11);
	}
	
	
	@Override //Return of the random number
	public int getObject() {
		int returnNumber = this.randomNumber + 1;
		return returnNumber;
	}

}
