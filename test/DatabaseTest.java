import junit.framework.TestCase;


public class DatabaseTest extends TestCase {

	Database database= new Database();
	
	public void testScoreBookSize() throws Exception {
		System.out.println(database.scoreBook[1]);
	}
	public void testPut() throws Exception {
		database.put(Score.H1);
		database.put(Score.H2);
		database.put(Score.H1);
		database.put(Score.H2);
		database.put(Score.H1);
		database.put(Score.H2);
		
	}
	
}
