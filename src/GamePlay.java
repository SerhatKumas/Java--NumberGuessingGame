
public class GamePlay {

	public void playTheGame(GameManager gameManager) {
		
		gameManager.printGameStartedMessage(new GameOutputDisplayer());
		
		while(true) {
		System.out.println("------------------------------------------------------");
		System.out.println("Enter Your Prediction Between 0-10  / To quit enter -1");
		int prediction = gameManager.getUserPrediction(new GameInputController());
		
		if (prediction>=-1 && prediction<=10) {
			if (prediction == -1) {
				gameManager.printGameFinishedMessage(new GameOutputDisplayer());
				System.exit(0);
			}
			
			else {
				int randomNumber = gameManager.getRandomNumber(new GameNumberCreator());
				boolean isPredictionRight = gameManager.checkResult(new GameResultChecker(), prediction, randomNumber);
				if(isPredictionRight) {
					gameManager.printWinMessage(new GameOutputDisplayer(), prediction, randomNumber);
				}
				else {	
					gameManager.printDefeatMessage(new GameOutputDisplayer(), prediction, randomNumber);
				}
			}
			
		}
		else {
			System.err.println("Enter valid number!!!");
			}
		
		
		
		}
		
	}
	
}
