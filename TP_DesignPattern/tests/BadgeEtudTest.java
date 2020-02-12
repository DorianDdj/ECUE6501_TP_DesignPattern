import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BadgeEtudTest {
	protected IBadge badge;

	@Before
	public void setUp() {
		badge = new BadgeEtud(4, "Claude", "Francois");
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testCreate() throws Exception {
		assertNotNull(new BadgeEtud(9, "Eddy", "Mitchell"));
	}

	@Test
	public void testGetId() throws Exception {
		assertEquals(4, badge.getID());
	}

	@Test
	public void testGetNomPrenom() throws Exception {
		assertEquals("Francois Claude", badge.getNomPrenom());
	}
}