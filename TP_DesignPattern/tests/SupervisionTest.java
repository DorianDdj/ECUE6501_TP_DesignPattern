import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SupervisionTest {
	protected IObserver sup;

	@Before
	public void setUp() throws Exception {
		sup = new Supervision();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotifyObserverAuthorized() {
		System.out.println("//Authorized");
		sup.notifyObserver(54783215, true);
	}
	
	@Test
	public void testNotifyObserverUnauthorized() {
		System.out.println("//Unauthorized");
		sup.notifyObserver(69453185, false);
	}
}
