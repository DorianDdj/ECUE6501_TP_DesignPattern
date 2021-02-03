package net.lenhard.app.badge;

public class FactoryBadge {
	public Badge getBadge(BadgeType type, String firstName, String lastName, String other) {
		Badge badge = null;

		switch (type) {
			case STUDENT:
				badge = new StudentBadge(firstName, lastName, other);
				break;

			case TEACHER:
				badge = new TeacherBadge(firstName, lastName, other);
				break;
		
			default:
				System.err.println("This type of badge does not exist!");
				break;
		}

		return badge;
	}
}
