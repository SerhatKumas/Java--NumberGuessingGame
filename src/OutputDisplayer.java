//Message displayer for game
public interface OutputDisplayer {
	
	void printWinMessage(int prediction, int randomNumber);
	void printDefeatMessage(int prediction, int randomNumber);
	void printGameHistory();
	void gameStartedMessage();
	void gameFinishedMessage();
	
}
