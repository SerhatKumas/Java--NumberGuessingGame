
public class GameResultChecker implements ResultChecker {
	
	private boolean isPredictionRight = false;
	
	//Checking whether prediction == randomNumber
	@Override
	public void checkResult(int prediction, int randomNumber) {
		
		isPredictionRight = (prediction == randomNumber) ?  true : false ;
		
	}
	
	//Get method for isRight boolean value
	@Override
	public boolean isPredictionRight() {
		boolean returnPredictionStatus = this.isPredictionRight;
		return returnPredictionStatus;
	}
	
	

}
