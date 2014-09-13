
public class Turn {
	private int noOfPerson;
	private int nthOfPerson=0;
	private int hit=0;
	
	
	public Turn(int noOfPerson){
		this.noOfPerson=noOfPerson;
		
	}
	
	public void checkTurn(Score score){
		hit++;
		if(score==Score.STRIKE){
			hit++;
		}//메소드 추출 하는게 좋을까? 
		if(hit/noOfPerson/2>8){//10번째 프레임에 들어섰을때
			if(score==Score.STRIKE){
				return;
			}
			if(score==Score.SPARE){
				hit=hit-1;
			}
		}
		if(hit%2==0){
			pointTurn();
			System.out.printf("now: %d 번째 사람 차례 \n",nthOfPerson+1);
		}
	}
	private void pointTurn() {
		nthOfPerson++;
		nthOfPerson=nthOfPerson%noOfPerson;
	}
	public int getNthOfPerson() {
		return nthOfPerson;
	}
	

}
