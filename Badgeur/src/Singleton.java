import java.util.HashMap;
import java.util.Map;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	static Singleton get_instence() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	static Map<String, Integer> get_badge() {
		Map<String, Integer> badge = new HashMap<String, Integer>();
		
		badge.put("b19015806", 0);
		badge.put("c15935754", 0);
		badge.put("a85265495", 1);
		
		return badge;
	}

}
