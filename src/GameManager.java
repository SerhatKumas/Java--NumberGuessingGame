import java.util.Random;
import java.util.Scanner;

public class GameManager {
	
	private int getUserPrediction(GameInputController inputTaker) {
		inputTaker.takeInput(new Scanner(System.in));
		int prediction = inputTaker.getUserInput();
		return prediction;
	}
	
	private int chooseRandomNumber(GameNumberCreator creator) {
		
		creator.createObject(new Random());
		int randomNumber = creator.getObject();
		return randomNumber;
	}
	
	private void printGameStartedMessage(GameOutputDisplayer displayer) {
		displayer.gameStartedMessage();
	}
	
	private void printGameFinishedMessage(GameOutputDisplayer displayer) {
		displayer.gameFinishedMessage();
	}
	
	private void printWinMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printWinMessage(prediction,randomNumber);
	}
	
	private void printDefeatMessage(GameOutputDisplayer displayer,int prediction,int randomNumber) {
		displayer.printDefeatMessage(prediction,randomNumber);
	}
	
	private boolean checkResult(GameResultChecker checker,int prediction,int randomNumber) {
		checker.checkResult(prediction, randomNumber);
		boolean isPredictionRight = checker.isPredictionRight();
		return isPredictionRight;
	}
	
}
