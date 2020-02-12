
public class Supervision implements IObserver {
	@Override
	public void notifyObserver(int ID, boolean auth) {
		System.out.println("SUPERVISION");
		if(auth)
			System.out.println("\tLe badge " + ID + " a été autorisé à rentrer.");
		else
			System.out.println("\tLe badge " + ID + " n'a pas été autorisé à rentrer.");
		System.out.println();
	}
}
