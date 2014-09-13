import junit.framework.TestCase;


public class ServiceTest extends TestCase {
	
	Service service;
	
	@Override
	protected void setUp() throws Exception {
		service = new Service();
	}
	

	public void testCreateZero() throws Exception {
		service.reset(0);
	
	}
	public void testCreateNum() throws Exception {
		service.reset(4);
	}
	public void testPlay() throws Exception {
		service.reset(4);
		service.put(Score.H1);
		
	}
	public void testShowNothing() throws Exception {
		service.reset(4);
	}
	public void testShowHitting() throws Exception {
		service.reset(3);
		service.put(Score.H1);
		service.put(Score.SPARE);
		
		service.put(Score.ZERO);
		service.put(Score.SPARE);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H1);
		service.put(Score.SPARE);
		
		service.put(Score.H2);
		service.put(Score.H5);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H6);
		service.put(Score.H2);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.STRIKE);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
	}

	public void testShowHitting2() throws Exception {
		service.reset(2);
		
		service.put(Score.H2);
		service.put(Score.H5);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H6);
		service.put(Score.H2);
		
		service.put(Score.H5);
		service.put(Score.H4);
		
		service.put(Score.H6);
		service.put(Score.H2);
	
	}
	public void testinteger() throws Exception {
		int a=0;
		while(a<10){
			System.out.print (a+"  ");
			System.out.println(a/2);
			a++;
		}
	}

}
