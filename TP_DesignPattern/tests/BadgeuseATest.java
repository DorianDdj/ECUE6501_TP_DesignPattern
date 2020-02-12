import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BadgeuseATest {
	protected IBadgeuse badgeuse;

	@Before
	public void setUp() throws Exception {
		BDD.addID(19030676);
		BDD.addID(24875621);
		BDD.addID(45217565);
		BDD.addID(75887454);
		
		badgeuse = new BadgeuseA();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetBadge() {
		IBadge badge = new BadgeEns(6, "Jean-Paul", "Sartre");
		badgeuse.getBadge(badge);
	}
}