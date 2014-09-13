
public class Database {
	ScoreCalculate scoreCalculate= new ScoreCalculate();
	Frame[] scoreBook= new Frame[10];
	int[] scoreTotal= new  int[10];
	int frameNum=0;
	
	public Database(){
		for(int i=0;i<scoreBook.length-1;i++){
			scoreBook[i]=new Frame();
			scoreTotal[i]=0;
		}
		scoreBook[scoreBook.length-1]=new Frame10();
	}
	public void sumScore(){
		int allScore=0;
		for(int tmp=0;tmp<10;tmp++){
			if(scoreBook[tmp].getTotal()==0){
				break;
			}
			allScore+=scoreBook[tmp].getTotal();
			if(scoreTotal[tmp]!=0){
				continue;
			}
			scoreTotal[tmp]=allScore;
		}
	}
	
	public void put(Score score) {
		scoreCalculate.put(new FrameNScore(score,frameNum/2));
		canPutTotal(score);//보너스 점수 관리 
		putToFrame(score);//각 프레임에 스코어값 넣기
		if(score==Score.STRIKE&&frameNum/2<9){
			putToFrame(Score.ZERO);
		}
		
		sumScore();
	}
	private void canPutTotal(Score score) {
		//이부분 scoreCalculate클래스에서 해주고 싶은데 그렇게 할수 있나요? \
		//scoreBook[scoreCalculate.getFrameNum()]이거 땜에 뭔가 막혔어요..
		
		if(scoreCalculate.isLastSp()){
			scoreBook[scoreCalculate.getFrameNum()].sumBonus(score.num);
		}
		if(scoreCalculate.isLLastSt()){
			scoreBook[scoreCalculate.getFrameNum()].sumBonus(
					scoreCalculate.LastScore()+score.num);
		}	
	}
	private void putToFrame(Score score) {
		scoreBook[frameNum/2].hit(score);
		if(frameNum/2==9){return;}
		frameNum++;
	}

	public void show(String whatprint) {
		
		for(int tmpNum=0;tmpNum<scoreBook.length;tmpNum++){
			if(whatprint==""){
				System.out.printf("| %2d  ",tmpNum+1);
				continue;
			}
			if(whatprint=="total"){
				showTotal(tmpNum);
				continue;
			}
			scoreBook[tmpNum].printValue();
		}
		
	}
	private void showTotal(int tmpNum) {
		if(scoreTotal[tmpNum]==0){
			System.out.print("|     ");
			return;
		}
		System.out.printf("| %3d ",scoreTotal[tmpNum]);
	}

}
