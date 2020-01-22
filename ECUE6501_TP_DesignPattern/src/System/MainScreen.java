package System;

import Badge.Badge;

//écran principal
public class MainScreen implements IObserver{
	static private MainScreen instance;
	private MainScreen() {};
	
	public static MainScreen getInstance() {
		if(instance==null)
			instance = new MainScreen();
		return instance;
	}

	@Override
	public void notify(Badge badge) {
		System.out.println("Affichage sur l'écran principal: l'utilisateur "+ badge.getId() +" a passé son badge");
	}
}
