import java.util.Scanner;

public class GameInputController implements InputController{

	private int userPrediction;
	
	@Override
	public void takeInput(Object obj) {
		// Taking user's prediction
		System.out.println("Enter Your Prediction : ");
		userPrediction = ((Scanner) obj).nextInt();
	}

	//User prediction get method
	public int getUserPrediction() {
		int returnNumber = this.userPrediction;
		return returnNumber;
	}

}
