import java.util.Random;
import java.util.Scanner;

public class GameManager {
	
	public int getUserPrediction(GameInputController inputTaker) {
		inputTaker.takeInput(new Scanner(System.in));
		int prediction = inputTaker.getUserInput();
		return prediction;
	}
	
	public int getRandomNumber(GameNumberCreator creator) {
		
		creator.createObject(new Random());
		int randomNumber = creator.getObject();
		return randomNumber;
	}
	
	public void printGameStartedMessage(GameOutputDisplayer displayer) {
		displayer.gameStartedMessage();
	}
	
	public void printGameFinishedMessage(GameOutputDisplayer displayer) {
		displayer.gameFinishedMessage();
	}
	
	public void printWinMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printWinMessage(prediction,randomNumber);
	}
	
	public void printDefeatMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printDefeatMessage(prediction,randomNumber);
	}
	
	public boolean checkResult(GameResultChecker checker,int prediction,int randomNumber) {
		checker.checkResult(prediction, randomNumber);
		boolean isPredictionRight = checker.isPredictionRight();
		return isPredictionRight;
	}
	
	
}
