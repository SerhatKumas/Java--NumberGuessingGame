import java.util.Scanner;

public class GameInputController implements InputController{

	//default value
	private int userInput = 0;
	

	@Override
	public void takeInput(Object obj) {
		// Taking user's input
		System.out.println("Enter the Number : ");
		userInput = ((Scanner) obj).nextInt();
	}
	
	
	
	@Override //User input get method
	public int getUserInput() {
		int returnNumber = this.userInput;
		return returnNumber;
	}
	


}
