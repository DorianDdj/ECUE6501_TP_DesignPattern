package System;
import Badge.Badge;
import Badge.BadgeFactory;
import Badgeuse.Badgeuse;
import Badgeuse.BadgeuseFactory;

public class Main {

	public static void main(String[] args) {
		Database.insert("19009228", "etudiant");
		Database.insert("19009229", "enseignant");
		
		Badge badge1 = BadgeFactory.build("19009228", Database.select("19009228"));
		Badge badge2 = BadgeFactory.build("19009229", Database.select("19009229"));
		
		Badgeuse badgeuseA = BadgeuseFactory.build("A");
		Badgeuse badgeuseB = BadgeuseFactory.build("B");
		
		MainScreen ecranPrincipal = MainScreen.getInstance();
		Admin supervisionAdmin = Admin.getInstance();
		
		badgeuseA.addObserver(ecranPrincipal);
		badgeuseA.addObserver(supervisionAdmin);
		
		badgeuseB.addObserver(ecranPrincipal);
		badgeuseB.addObserver(supervisionAdmin);
		
		badgeuseA.checkBadge(badge1);
		
	}
}
