import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BDDTest {

	@Before
	public void setUp() throws Exception {
		BDD.addID(19030676);
		BDD.addID(24875621);
		BDD.addID(45217565);
		BDD.addID(75887454);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetIdTrue() {
		assertEquals(true, BDD.getID(19030676));
	}
	
	@Test
	public void testGetIdFalse() {
		assertEquals(false, BDD.getID(48351248));
	}
}
