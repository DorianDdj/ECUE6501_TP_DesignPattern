package Badgeuse;

import Badge.BadgeStudent;
import Badge.BadgeTeacher;

public class BadgeuseFactory {
	
	//instancie et renvoie une badgeuse en fonction du type (A ou B) passé en paramètre
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
