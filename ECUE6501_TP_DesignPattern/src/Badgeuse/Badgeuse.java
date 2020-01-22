package Badgeuse;

import java.util.ArrayList;
import java.util.List;

import Badge.Badge;
import System.Database;
import System.IObserver;

public class Badgeuse {
	//les observers à notifier lors d'un passage de badge
	List<IObserver> observers;
	
	Badgeuse() {
		observers = new ArrayList<>();
	}
	
	//ajouter un observer à notifier de cette badgeuse
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	
	//retirer un observer de cette badgeuse
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}
	
	//vérifie le badge, retourne vrai si l'utilisateur existe
	public boolean checkBadge(Badge badge) {
		//si l'utilisateur est trouvé dans la bdd
		if(Database.select(badge.getId()) != null) {
			//notifie les observers
			observers.forEach((observer)->{
				observer.notify(badge);
			});
			return true;
		}
		else
			return false;
	}
}
