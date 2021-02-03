package net.lenhard.app.badge;

import java.util.UUID;

public abstract class Badge {
	protected UUID id;
	protected String firstName;
	protected String lastName;

	public UUID getId() {
		return id;
	}

	protected void setId(UUID id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirsName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
