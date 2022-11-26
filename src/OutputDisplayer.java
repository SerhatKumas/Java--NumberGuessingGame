//Message displayer for game
public interface OutputDisplayer {
	
	//Victory message printer
	void printWinMessage(int prediction, int randomNumber);
	//Defeat message printer
	void printDefeatMessage(int prediction, int randomNumber);
	//Game initialize message printer
	void gameStartedMessage();
	//Game finish message printer
	void gameFinishedMessage();
	
}
