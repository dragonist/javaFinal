
public class FrameNScore {
	public FrameNScore(Score score, int frameNum) {
		this.frameNum=frameNum;
		this.score=score;
	}
	public FrameNScore() {//이거 위에 랑 합치는 방법 있던거 같은데 뭔지 모르겠어요
		this.frameNum=0;
		this.score=Score.NONE;
	}
	public int frameNum;
	public Score score;
}
