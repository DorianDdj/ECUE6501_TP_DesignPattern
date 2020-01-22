import java.util.HashMap;
import java.util.Map;

public class Carte {
	
	boolean verifier(String id) {
		Singleton.get_instence(); 
		
		Map<String, Integer> badge = new HashMap<String, Integer>();
		badge = Singleton.get_badge();
		
		if(badge.get(id) == 0) {			
			return true;
		}
		
		return false;
	}

}
