import java.util.HashMap;
import java.util.Map;

/* Simule la base de données non implémentée */
public class Database {
	/*données <numéro, type d'utilisateur>
	 ex: <"19009228", "etudiant"> */
	Map<String, String> data = new HashMap<>();
	
	//Simule une requête insert
	//prend en paramètre le numéro d'utilisateur et son type
	static void insert(String id, String type) {
		
	}
	
	//Simule une requête select
	//prend en paramètre le numéro d'utilisateur
	//renvoie le type d'utilisateur
	static String select(String id) {
		return "";
	}
	
}