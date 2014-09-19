
public class Frame10 extends Frame{
	public boolean put(Score tmpScore){
		
		boolean result;
		if(whereToPut==1){
			thirdScore=tmpScore.num;
			whereToPut++;
			return true;
		}
		result=super.put(tmpScore);
		if(isitStrike()){
			whereToPut--;
			result=false;
		}
		if(isitSpare()){
			result=false;
		}
		return result;
		
	}
	public void showScore() {
		String tmpScoreStr=makeScoreStr();
		tmpScoreStr+=moreScoreStr();
		System.out.print(tmpScoreStr);
		
	}
	private String moreScoreStr() {
		String ScoreS="";
		if(whereToPut==2){
			ScoreS+=thirdScore+"";
		}
		return ScoreS+"|";
	}
	public int showTotal() {
		return firstScore+secondScore+thirdScore;
	}
}
