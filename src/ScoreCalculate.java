

public class ScoreCalculate {
	
	//frameNScore클래스 않쓰고 스코어랑 프레임 저장할수 있는거 뭐 없을까요?? 
	//배열은 같은 자료형만 넣을수 있는데 자료형이 다를때 쓸수 있는 묶음이 뭔지 모르겠어요 
	private FrameNScore LLast=new FrameNScore();
	private FrameNScore Last=new FrameNScore();
	private FrameNScore Now=new FrameNScore();
	private int tmpFrameNum;

	public void put(FrameNScore tmp) {
		LLast=Last;
		Last=Now;
		Now=tmp;
	}
	public boolean isLastSp() {
		if(Last.score==Score.SPARE){
			tmpFrameNum = Last.frameNum;
			return true;
		}
		return false;
	}
	
	public boolean isLLastSt() {
		if(LLast.score==Score.STRIKE){
			tmpFrameNum=LLast.frameNum;
			return true;
		}
		return false;
	}
	public int getFrameNum() {
		return tmpFrameNum;
	}
	public int LastScore() {
		return Last.score.num;
	}
}
