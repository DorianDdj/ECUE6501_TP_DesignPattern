package net.lenhard.app.badge;

import net.lenhard.app.Database;

public class StudentBadge extends Badge {
	private String promotion;

	public StudentBadge(String firstName, String lastName, String promotion) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.promotion = promotion;

		this.id = Database.getInstance().createStudent(this);
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
}
