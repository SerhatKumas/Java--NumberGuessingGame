
public class GameResultChecker implements ResultChecker {
	
	private boolean isPredictionRight = false;

	@Override
	public void checkResult(int prediction, int randomNumber) {
		
		isPredictionRight = (prediction == randomNumber) ?  true : false ;
		
	}
	
	@Override
	public boolean isPredictionRight() {
		boolean returnPredictionStatus = this.isPredictionRight;
		return returnPredictionStatus;
	}
	
	

}
