import java.util.ArrayList;

public class BadgeuseB implements IBadgeuse {
	ArrayList<IObserver> ListOfObservers = new ArrayList<IObserver>();
	boolean authorization = false;
	
	@Override
	public void getBadge(IBadge badge) { //vérification de la présence du badge dans la BDD
		authorization = BDD.getID(badge.getID());
		
		System.out.println("BADGEUSE B : ");
		
		for(IObserver o : ListOfObservers)
			o.notifyObserver(badge.getID(), authorization);
	}

	@Override
	public void addObserver(IObserver o) { //ajouter un observer
		ListOfObservers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) { //supprimer un observer
		ListOfObservers.remove(ListOfObservers.indexOf(o));
	}
}
