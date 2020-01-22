package System;

//écran principal
public class MainScreen {
	static private MainScreen instance;
	private MainScreen() {};
	
	public MainScreen getInstance() {
		if(instance==null)
			instance = new MainScreen();
		return instance;
	}
}
