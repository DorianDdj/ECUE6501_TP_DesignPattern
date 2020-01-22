
public class BadgeFactory {
	public static IBadge createBadge(int type, int ID, String prenom, String nom) {
		if(type == 0) //enseignant
			return new BadgeEns(ID, prenom, nom);
		if(type == 1) //etudiant
			return new BadgeEtud(ID, prenom, nom);
		return null;
	}
}
