package net.lenhard.app.badge;

import net.lenhard.app.Database;

public class TeacherBadge extends Badge {
	private String position;

	public TeacherBadge(String firstName, String lastName, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;

		this.id = Database.getInstance().createTeacher(this);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
