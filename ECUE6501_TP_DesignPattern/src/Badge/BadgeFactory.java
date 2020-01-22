package Badge;

public class BadgeFactory {
	
	//instancie et renvoie un badge en fonction du type (etudiant ou enseignant) passé en paramètre
	public static Badge build(String id, String type) {
		Badge badge = null;
		switch(type) {
			case "etudiant":
				badge = new BadgeStudent(id);
			break;
			case "enseignant":
				badge = new BadgeTeacher(id);
			break;
		}
		return badge;
	}

}
