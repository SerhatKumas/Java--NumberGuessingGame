import java.util.Random;
import java.util.Scanner;

public class GameManager {
	
	//Runner method for getting user prediction
	public int getUserPrediction(GameInputController inputTaker) {
		inputTaker.takeInput(new Scanner(System.in));
		int prediction = inputTaker.getUserInput();
		return prediction;
	}
	
	//Runner method for creating random number
	public int getRandomNumber(GameNumberCreator creator) {
		
		creator.createObject(new Random());
		int randomNumber = creator.getObject();
		return randomNumber;
	}
	
	//Runner method for printing game starting message
	public void printGameStartedMessage(GameOutputDisplayer displayer) {
		displayer.gameStartedMessage();
	}
	
	//Runner method for printing game finishing message
	public void printGameFinishedMessage(GameOutputDisplayer displayer) {
		displayer.gameFinishedMessage();
	}
	
	//Runner method for printing win message
	public void printWinMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printWinMessage(prediction,randomNumber);
	}
	
	//Runner method for printing losing message
	public void printDefeatMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printDefeatMessage(prediction,randomNumber);
	}
	
	//Runner method for checking if random number == prediction
	public boolean checkResult(GameResultChecker checker,int prediction,int randomNumber) {
		checker.checkResult(prediction, randomNumber);
		boolean isPredictionRight = checker.isPredictionRight();
		return isPredictionRight;
	}
	
	
}
