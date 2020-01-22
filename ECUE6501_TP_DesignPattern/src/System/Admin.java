package Badge;

//supérvision de l'administrateur
public class Admin {
	static private Admin instance;
	private Admin() {};
	
	public Admin getInstance() {
		if(instance==null)
			instance = new Admin();
		return instance;
	}
}
