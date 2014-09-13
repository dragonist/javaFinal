public class Frame {
	
	protected Score first=Score.NONE;
	protected Score second=Score.NONE;
	protected int sumFS;
	protected int total=0;
	

	public void hit(Score score) {
		if(first==Score.NONE){
			first=score;
			return;
		}
		second=score;
		sumFS=first.num+second.num;
		if(score==Score.SPARE){
			sumFS=10;
		}
		CanShowTotal();
	}

	private void CanShowTotal() {
		if(first==Score.STRIKE||second==Score.SPARE){
			return;
		}
		putTotal();
	}
	public int getTotal() {
		return total;
	}
	protected void putTotal() {
		if(total==0){
		total=sumFS;
		}
	}

	public void sumBonus(int bonus){
		sumFS=sumFS+bonus;
		putTotal();
	}

	public void printValue() {
			System.out.printf("|%2s|%2s",first.value,second.value);
	}
}
