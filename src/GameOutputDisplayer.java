
public class GameOutputDisplayer implements OutputDisplayer {

	@Override
	public void printWinMessage(int prediction, int randomNumber) {
		// Win Message
		System.out.println("Your guess is right");
		System.out.println("Your prediction was " + prediction + " and random number was " + randomNumber);
		
	}

	@Override
	public void printDefeatMessage(int prediction, int randomNumber) {
		// Defeat Message
		System.out.println("Your guess is wrong");
		System.out.println("Your prediction was " + prediction + " and random number was " + randomNumber);
		
	}


	@Override
	public void gameStartedMessage() {
		// Game Start Message
		System.out.println("###### Number Guessing Game ######");
		System.out.println("######   Game is Starting   ######");
		
	}

	@Override
	public void gameFinishedMessage() {
		// Game Finish Message
		System.out.println("######  Thanks For Playing  ######");
		System.out.println("######   Game is Finished   ######");
		System.out.println("###### Number Guessing Game ######");
	}

}
