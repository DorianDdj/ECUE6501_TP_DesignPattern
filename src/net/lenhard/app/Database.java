package net.lenhard.app;

import java.util.UUID;

import net.lenhard.app.badge.StudentBadge;
import net.lenhard.app.badge.TeacherBadge;

public class Database {
	private static Database instance = null;
	private UUID accessRefuseTEST = null;

	private Database() { }

	public static Database getInstance() {
			if (instance == null) {
				instance = new Database();
			}

			return Database.instance;
	}

	public boolean hasAccess(UUID uuid) {
		if(uuid == this.accessRefuseTEST) return false; //ONLY FOR TEST
		return true;
	}

	public UUID createTeacher(TeacherBadge teacher) {
		return UUID.randomUUID();
	}

	public UUID createStudent(StudentBadge student) {
		UUID uuid = UUID.randomUUID();
		if(student.getFirstName().equals("Olivier")) this.accessRefuseTEST = uuid;
		return uuid;
	}
}