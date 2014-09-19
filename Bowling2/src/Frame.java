
public class Frame {
	int firstScore;
	int secondScore;
	int thirdScore;
	int whereToPut=0;
	Frame nextFrame;
	
	
	public boolean put(Score tmpScore) {
		
		if(whereToPut==0){
			firstScore=tmpScore.num;
			whereToPut++;
			if(isitStrike()){
				whereToPut++;
				return true;
			}
			return false;
		}
		if(isitOverScore(tmpScore)){
			System.err.println("error! try again");
			return false;
		}
		secondScore=tmpScore.num;
		whereToPut++;
		return true;
	}
	private boolean isitOverScore(Score tmpScore) {
		return tmpScore.num+firstScore>10;
	}
	public boolean isitStrike() {
		return firstScore==10;
	}
	
	protected boolean isitSpare() {
		return firstScore+secondScore==10;
	}
	
	
	
	public void showScore() {
		String tmpScoreStr=makeScoreStr();
		System.out.print(tmpScoreStr);
	}
	protected String makeScoreStr() {
		
		String tmpScoreS="|";
		if(whereToPut==0){
			tmpScoreS+=" | ";
			return tmpScoreS;
		}
		if(isitStrike()){
			tmpScoreS+="X|-";
			return tmpScoreS;
		}
		tmpScoreS+=""+firstScore;
		
		if(whereToPut==1){
			tmpScoreS+="| ";
			return tmpScoreS;
		}
		if(isitSpare()){
			tmpScoreS+="|/";
			return tmpScoreS;
		}
		
		tmpScoreS+="|"+secondScore;
		return tmpScoreS;
	
		
	}
	protected void MakeIntArrayScore(int[] tmpScoreInt) {
		
		for(int i=0; i<whereToPut;i++){
			switch(i){
			case 0:tmpScoreInt[0]=firstScore;break;
			case 1:tmpScoreInt[1]=secondScore; break;
			case 2:tmpScoreInt[2]=thirdScore; break;
			default: break;
			}
		}
	}
	
	
	
	
	
	public int showTotal() {
		
		if(whereToPut==2){
			int Total=getTotal();
			if(isitStrike()){
				if(failNextCheck()){
					return 0;
				}
				Total+=NextScore();
				if(nextFrame.isitStrike()){
					if(nextFrame.failNextCheck()){
						return 0;
					}
					Total+=nextFrame.nextFrame.getfirstScore();
				}
				return Total;
			}
			if(isitSpare()){
				if(failNextCheck()){
					return 0;
				};
				Total+=NextScore();
			}
			return Total;
		}
		return 0;
	}
	private int getfirstScore() {
		return firstScore;
	}
	public int NextScore() {
		return nextFrame.getTotal();
	}
	public int getTotal(){
		return firstScore+secondScore+thirdScore;
	}
	public boolean failNextCheck(){
		if(nextFrame==null){
			return true;
		}
		return false;
	}
	
	public void getNextFrame(Frame frame){
		nextFrame=frame;
	}
	
}
