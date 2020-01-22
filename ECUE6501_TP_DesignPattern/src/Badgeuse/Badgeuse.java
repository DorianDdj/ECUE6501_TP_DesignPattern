package Badgeuse;

import Badge.Badge;
import System.Database;

public class Badgeuse {
	//vérifie le badge, retourne vrai si l'utilisateur existe
	public boolean checkBadge(Badge badge) {
		return Database.select(badge.getId()) != null;
	}
}
