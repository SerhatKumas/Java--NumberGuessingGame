public class GamePlay {

  //Game flow code
  public void playTheGame(GameManager gameManager) {

    gameManager.printGameStartedMessage(new GameOutputDisplayer());

    while (true) {
      System.out.println("------------------------------------------------------");
      System.out.println("Enter Your Prediction Between 0-10  / To quit enter -1");
      //Taking prediction
      int prediction = gameManager.getUserPrediction(new GameInputController());

      if (prediction >= -1 && prediction <= 10) {
    	  //Ending game
        if (prediction == -1) {
          gameManager.printGameFinishedMessage(new GameOutputDisplayer());
          System.exit(0);
        }
        //Game play
        else {
          int randomNumber = gameManager.getRandomNumber(new GameNumberCreator());
          boolean isPredictionRight = gameManager.checkResult(new GameResultChecker(), prediction, randomNumber);
          //Wining clause
          if (isPredictionRight) {
            gameManager.printWinMessage(new GameOutputDisplayer(), prediction, randomNumber);
          }
          //Losing play
          else {
            gameManager.printDefeatMessage(new GameOutputDisplayer(), prediction, randomNumber);
          }
        }

      } else {
        System.err.println("Enter valid number!!!");
      }

    }

  }

}
