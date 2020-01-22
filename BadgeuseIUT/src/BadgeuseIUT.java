
public class BadgeuseIUT {

	public static void main(String[] args) {
		
		// Création des badgeuses bA et bB
		FactoryLecteurBadge f = new FactoryLecteurBadge();
		ILecteurBadge bA = f.createBadgeuse(1);
		ILecteurBadge bB = f.createBadgeuse(2);
		
		// Création des Syst
		Syst sA = new Syst();
		SystAdmin sB = new SystAdmin();
		
		// On enregistre les Syst dans la liste d'observers des badgeuses
		bA.addSyst(sA);
		bA.addSyst(sB);
		bB.addSyst(sA);
		bB.addSyst(sB);
		
		// Création de badges
		Badge badgeEtu = new Badge("LeBohec", "Laëtitia", 1);
		Badge badgeProf = new Badge("SonSec", "Sophie", 2); // LOL Saucisson Sec
		Badge badgeProf2 = new Badge("Affrit", "Barack", 2); // Pardon
		Badge badgeEtu2 = new Badge("Rave", "Beth", 1); // Promis j'arrête
		
		bA.access(badgeEtu);
		bB.access(badgeEtu2);
		
		bA.access(badgeProf);
		bB.access(badgeProf2);
	}

}
