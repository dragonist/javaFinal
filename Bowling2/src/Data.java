
public class Data {
	Frame[] frames=new Frame[10];
	int nthFrame=0;
	int Total=0;
	
	public Data() {
		for(int i=0; i<9;i++){
			frames[i]=new Frame();
		}
		frames[9]=new Frame10();
	}
	boolean put(Score tmpScore){
		
		boolean canGoNextFrame=frames[nthFrame].put(tmpScore);
		
		if(canGoNextFrame){
			if(nthFrame!=0){
				frames[nthFrame-1].getNextFrame(frames[nthFrame]);
			}
			nthFrame++;
			
			if(nthFrame>10){//예외처리
				nthFrame=10;
				System.out.println("U done. please reset");
			}
			return true;
		}
		return false;
	}

	public void show(String string) {
		//운영체제에선 입력,계산, 입력,계산 이러면 느려진다 하든데.. 
		Total=0;
		for(int i=0;i<10;i++){
			if(string=="Num"){
				showNum(i);
				continue;
			}
			if(string=="Score"){
				showScore(i);
				continue;
			}
			if(string=="Total"){
				showTotal(i);
				continue;
			}
		}
		
	}
	private void showNum(int i) {
		System.out.printf("|%2d ",i+1);	
	}
	private void showScore(int i) {
		//여기도 바로밑 showTotal처럼  frame에서 값가져와서 프린트하는게 좋을까?
		frames[i].showScore();
		
	}
	private void showTotal(int i) {
		int NowTotal=Total;
		NowTotal=frames[i].showTotal();
		
		if(NowTotal==0){
			System.out.print("|   ");
			return;
		}
		Total+=NowTotal;
		System.out.printf("|%2d ",Total);
	}
	
	
}
