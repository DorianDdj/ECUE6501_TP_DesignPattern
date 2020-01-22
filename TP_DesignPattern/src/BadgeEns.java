
public class BadgeEns implements IBadge {
	private static int ID = 0;
	private static String nom = "";
	private static String prenom = "";
	
	public BadgeEns(int _ID, String _prenom, String _nom) { //création
		ID = _ID;
		nom = _nom;
		prenom = _prenom;
	}
	
	public int getID() { //accès à l'ID
		return ID;
	}

	@Override
	public String getNomPrenom() { //retourne le nom et le prénom
		String np="";
		np = nom + " " + prenom;
		return np;
	}
}
