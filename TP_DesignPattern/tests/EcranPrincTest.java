import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EcranPrincTest {
	protected IObserver ecran;

	@Before
	public void setUp() throws Exception {
		ecran = new EcranPrinc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotifyObserverAuthorized() {
		System.out.println("//Authorized");
		ecran.notifyObserver(15747624, true);
	}
	
	@Test
	public void testNotifyObserverUnauthorized() {
		System.out.println("//Unauthorized");
		ecran.notifyObserver(24576348, false);
	}
}
