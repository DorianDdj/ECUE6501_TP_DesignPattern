import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BadgeEnsTest {
	protected IBadge badge;

	@Before
	public void setUp() {
		badge = new BadgeEns(1, "Jean", "Dupont");
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testCreate() throws Exception {
		assertNotNull(new BadgeEns(5, "Jean", "Pierre"));
	}

	@Test
	public void testGetId() throws Exception {
		assertEquals(1, badge.getID());
	}

	@Test
	public void testGetNomPrenom() throws Exception {
		assertEquals("Dupont Jean", badge.getNomPrenom());
	}
}
