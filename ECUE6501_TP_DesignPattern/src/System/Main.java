package System;
import Badge.Badge;
import Badge.BadgeFactory;
import Badgeuse.Badgeuse;
import Badgeuse.BadgeuseFactory;

public class Main {

	public static void main(String[] args) {
		//insértion jeu d'essai
		Database.insert("19009228", "etudiant");
		Database.insert("19009229", "enseignant");
		
		//création de 2 badges
		Badge badge1 = BadgeFactory.build("19009228", Database.select("19009228"));
		Badge badge2 = BadgeFactory.build("19009229", Database.select("19009229"));
		
		//création de 2 badgeuse
		Badgeuse badgeuseA = BadgeuseFactory.build("A");
		Badgeuse badgeuseB = BadgeuseFactory.build("B");
		
		//ajouts de l'écran principal et de la supervision de l'administrateur comme observer pour les deux badgeuses
		badgeuseA.addObserver(MainScreen.getInstance());
		badgeuseA.addObserver(Admin.getInstance());
		badgeuseB.addObserver(MainScreen.getInstance());
		badgeuseB.addObserver(Admin.getInstance());
		
		//passage d'un badge dans une badgeuse
		badgeuseA.checkBadge(badge1);
		
	}
}
