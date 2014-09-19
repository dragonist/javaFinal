
public class Service {
	Data[] data;
	int nthperson=0;
	int nOfPerson;
	
	public Service(int nOfPerson){
		if(nOfPerson<1){
			//errror
		}
		this.nOfPerson=nOfPerson;
		data=new Data[nOfPerson];
		for(int i=0; i<nOfPerson;i++){
			data[i]=new Data();
		}
	}
	
	void put(Score tmpScore){
		boolean canGoNext=data[nthperson].put(tmpScore);
		if(canGoNext){
			nthperson=(nthperson+1)%nOfPerson;
		}
	}
	void Show(){
		for(int i=0;i<nOfPerson;i++){
			Show(i);
		}
	}
	void Show(int nthperson){
		data[nthperson].show("Num");
		System.out.println("");
		data[nthperson].show("Score");
		System.out.println("");
		data[nthperson].show("Total");
		System.out.println("");
		System.out.println("");
	}
	
	
}
