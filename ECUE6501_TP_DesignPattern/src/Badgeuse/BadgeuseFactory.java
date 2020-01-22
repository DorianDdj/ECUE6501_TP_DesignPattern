package Badgeuse;

import Badge.BadgeStudent;
import Badge.BadgeTeacher;

public class BadgeuseFactory {
	
	public static Badgeuse build(String type) {
		Badgeuse badgeuse = null;
		switch(type) {
		case "A":
			badgeuse = new BadgeuseTypeA();
		break;
		case "B":
			badgeuse = new BadgeuseTypeB();
		break;
	}
		return badgeuse;
	}

}
