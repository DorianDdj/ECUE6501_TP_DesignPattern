
public class Factory {
	
	IDroit creat(int i, String id) {
		
		if(i == 0) {
			Eleve eleve = new Eleve();
			
			eleve.set_id(id);
			eleve.set_droit();			
			return eleve;
		}
		else {
			Profe profe = new Profe();
			
			profe.set_id(id);
			profe.set_droit();			
			return profe;
		}
	}

}
