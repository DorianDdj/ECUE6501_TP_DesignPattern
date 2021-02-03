package net.lenhard.app;

public class AdminSupervision implements ObserverInterface {
	@Override
	public void event(String message) {
		System.out.println("(AdminSupervision) I've been notified! > " + message);
}
}
