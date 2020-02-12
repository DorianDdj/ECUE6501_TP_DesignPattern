import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BadgeFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateEns() {
		assertNotNull(BadgeFactory.createBadge(0, 25, "Jean", "Dupont"));
	}
	
	@Test
	public void testCreateEtud() {
		assertNotNull(BadgeFactory.createBadge(1, 7, "Patrick", "Balkany"));
	}
}