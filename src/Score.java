
public enum Score {
	STRIKE(10,"X"),SPARE(10,"/"),H0(0,"0"),ZERO(0,"-"),NONE(0," "),
	H1(1,"1"),H2(2,"2"),H3(3,"3"),H4(4,"4"),H5(5,"5"),H6(6,"6"),H7(7,"7"),H8(8,"8"),H9(9,"9");
	public int num;
	public String value;
	private Score(int num,String value){
		this.value=value;
		this.num=num;
	}
	
}
