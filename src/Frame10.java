
public class Frame10 extends Frame{
	private Score third=Score.NONE;
	
	public void hit(Score score) {
		if(second!=Score.NONE){
			third=score;
			sumFS+=third.num;
			System.out.println(sumFS);
			putTotal();
			return;
			
		}
		super.hit(score);
		System.out.println(sumFS);
	}

	public void sumBonus(int bonus){
	}

	public void printValue() {
		System.out.printf("|%2s|%2s|%2s",first.value,second.value,third.value);
	}

}
