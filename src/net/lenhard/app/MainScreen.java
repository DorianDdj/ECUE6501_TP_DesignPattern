package net.lenhard.app;

public class MainScreen implements ObserverInterface {
	@Override
	public void event(String message) {
			System.out.println("(MainScreen) I've been notified! > " + message);
	}
}
