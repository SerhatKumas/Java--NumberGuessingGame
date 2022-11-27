import java.util.Scanner;

public class GameInputController implements InputController{

	//default value
	private int userInput = 0;
	

	@Override
	public void takeInput(Object object) {
		// Taking user's input
		userInput = ((Scanner) object).nextInt();
	}
	
	
	
	@Override //User input get method
	public int getUserInput() {
		int returnNumber = this.userInput;
		return returnNumber;
	}
	


}
