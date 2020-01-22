import java.util.ArrayList;

public class Badge {
	String Prenom;
	String Nom;
	int TypeBadge; //1: Student, 2: Teacher & Administrators
	
	public Badge (String _Nom, String _Prenom, int _TypeBadge) {
		Prenom = _Prenom;
		Nom = _Nom;
		TypeBadge = _TypeBadge;
	}
	
	public int getTypeBadge() { return TypeBadge; }
	public ArrayList<String> getNomPrenom() {
		ArrayList<String> data = new ArrayList<String> ();
		data.add(Nom);
		data.add(Prenom);
		
		return data;
	}
	
}
