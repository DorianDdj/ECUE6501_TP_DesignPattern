package System;

import Badge.Badge;
import Badgeuse.Badgeuse;

//supérvision de l'administrateur
public class Admin implements IObserver {
	static private Admin instance;
	private Admin() {};
	
	public Admin getInstance() {
		if(instance==null)
			instance = new Admin();
		return instance;
	}

	@Override
	public void notify(Badge badge) {
		System.out.println("Ecriture dans le fichier de log de l'administrateur: l'utilisateur "+ badge.getId() +" a passé son badge");
	}
}
