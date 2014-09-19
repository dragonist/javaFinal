import java.util.Scanner;




public class Bowling {
	static Service service;
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("welcome");
		while(true){
			start();
			playing();
			
			System.out.println("doUwant exit? 1.yes 2.no");
			if(scan.nextInt()==1){
				break;
			}
		}
		
	}

	private static void playing() {
		while(true){
			System.out.println("putScore");
			putScore();
			System.out.println("show");
			service.Show();
			
		}
	}

	private static void putScore() {
		int tmp = getIntValue();
		switch(tmp){
			case 0:
				service.put(Score.H0);
				break;
			case 1:
				service.put(Score.H1);
				break;
			case 2:
				service.put(Score.H2);
				break;
			case 3:
				service.put(Score.H3);
				break;
			case 4:
				service.put(Score.H4);
				break;
			case 5:
				service.put(Score.H5);
				break;
			case 6:
				service.put(Score.H6);
				break;
			case 7:
				service.put(Score.H7);
				break;
			case 8:
				service.put(Score.H8);
				break;
			case 9:
				service.put(Score.H9);
				break;
			case 10:
				service.put(Score.H10);
				break;
			default:
				System.err.println("put again! 0~10");
				break;
		}
	}
	
	
	private static void start() {
		System.out.println("how many person? (put more than 0)");
		service= new Service(getIntValue());
	}
	
	
	private static int getIntValue(){
		while(!scan.hasNextInt()){
			scan.next();
			System.err.print("에러!! 다시 입력해주세요: ");
		}
		return scan.nextInt();
	}
	
}
