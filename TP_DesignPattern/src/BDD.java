import java.util.ArrayList;

public class BDD {
	private static ArrayList<Integer> ListOfBadges = new ArrayList<Integer>();
	
	public static boolean getID(int IDBadge) {
		boolean access=false;
		
		for(int i=0;i<ListOfBadges.size(); i++) {
			if(ListOfBadges.get(i)==IDBadge)
				access = true;
		}
		return access;
	}
	
	public static void addID(int IDBadge) {
		ListOfBadges.add(IDBadge);
	}
	
	public static void removeID(int IDBadge) {
		ListOfBadges.remove(ListOfBadges.indexOf(IDBadge));
	}
}
