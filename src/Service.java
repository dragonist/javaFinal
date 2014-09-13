
public class Service {
	private Database[] database;
	private Turn turn;

	public void reset(int noOfPerson) {
		if(noOfPerson<1){
			//예외처리 
		}
		database= new Database[noOfPerson];
		turn= new Turn(noOfPerson);
		for(int i=0;i<database.length;i++){
			database[i]=new Database();
		}
	}

	public void put(Score score) {
		database[turn.getNthOfPerson()].put(score);
		showTotal();
		turn.checkTurn(score);
	}
	
	private void showTotal() {
		for(int tmpPoint=0;tmpPoint<database.length;tmpPoint++){
			
			database[tmpPoint].show("");
			System.out.println("   |");
			database[tmpPoint].show("score");
			System.out.println("|");
			database[tmpPoint].show("total");
			System.out.println("   |");
			System.out.println("");
		}
		System.out.println("");
	}
	
}
