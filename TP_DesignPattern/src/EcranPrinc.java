
public class EcranPrinc implements IObserver {
	@Override
	public void notifyObserver(int ID, boolean auth) {
		System.out.println("ECRAN PRINCIPALE");
		if(auth)
			System.out.println("Le badge " + ID + " a été autorisé à rentrer.");
		else
			System.out.println("Le badge " + ID + " n'a pas été autorisé à rentrer.");
		System.out.println();
	}
}
