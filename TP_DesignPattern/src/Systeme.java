
public class Systeme {
	public static void main(String[] args) {
		IObserver sup = new Supervision();
		IObserver ep = new EcranPrinc();
		
		IBadgeuse B1 = BadgeuseFactory.createBadgeuse(1);
		B1.addObserver(sup);
		B1.addObserver(ep);
		
		IBadgeuse B2 = BadgeuseFactory.createBadgeuse(0);
		B2.addObserver(sup);
		B2.addObserver(ep);
		
		IBadge etud1 = BadgeFactory.createBadge(1, 19030676, "Axel", "Laforge");
		IBadge ens1 = BadgeFactory.createBadge(0, 45217565, "Guy", "Yiotine");
		IBadge etud2 = BadgeFactory.createBadge(1, 24875621, "Burt", "Hatartynn");
		IBadge ens2 = BadgeFactory.createBadge(0, 75887454, "Richard", "Dasso");
		
		BDD.addID(19030676);
		BDD.addID(24875621);
		BDD.addID(45217565);
		BDD.addID(75887454);

		B1.getBadge(etud1);
	}
}
