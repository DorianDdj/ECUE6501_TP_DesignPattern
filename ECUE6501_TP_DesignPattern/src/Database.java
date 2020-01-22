import java.util.HashMap;
import java.util.Map;

/* Simule la base de données non implémentée */
public class Database {
	//données <numéro, type d'utilisateur>
	//ex: <"19009228", "etudiant">
	static Map<String, String> data = new HashMap<>();
	
	//Simule une requête insert
	//prend en paramètre le numéro d'utilisateur et son type
	static void insert(String id, String type) {
		data.put(id, type);
	}
	
	//Simule une requête select
	//prend en paramètre le numéro d'utilisateur
	//renvoie le type d'utilisateur s'il existe, sinon null
	static String select(String id) {
		if(data.containsKey(id))
			return data.get(id);
		else
			return null;
	}
	
}