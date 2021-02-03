package net.lenhard.app.badgemachine;

import net.lenhard.app.Database;
import net.lenhard.app.Subject;
import net.lenhard.app.badge.Badge;

public abstract class BadgeMachine extends Subject {

	public void read(Badge badge) { 
		if(Database.getInstance().hasAccess(badge.getId())){
			openDoor();
			this.notifyObservers("Open door for " + badge.getFirstName());
		}
		else {
			this.notifyObservers("Blocking access for " + badge.getFirstName());
		};
	}

	public void openDoor() {
		//TODO
	}

}
