
public class BadgeFactory {
	public static IBadge createBadge(int type, int ID, String prenom, String nom) {
		if(type == 0) { //enseignant
			IBadge badge = new BadgeEns(ID, prenom, nom);
			return badge;
		}
		if(type == 1) { //etudiant
			IBadge badge = new BadgeEtud(ID, prenom, nom);
			return badge;
		}
		return null;
	}
}
