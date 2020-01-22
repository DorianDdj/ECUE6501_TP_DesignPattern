package Badge;

public class BadgeFactory {
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
