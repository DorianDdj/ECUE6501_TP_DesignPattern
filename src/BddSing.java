// Création d'une classe Singleton
public class BddSing 

{
	// Création du constructeur (privé)
	private BddSing()
	{
		
	}

	// Variable d'instance, objet de type Singleton
	BddSing obj;
	
	// Fonction d'accès à l'instance
	@SuppressWarnings("unused")
	private BddSing getInstance()
	
	{
		if (obj==null)
		{
			// Donne une valeur à l'objet si l'objet n'avait pas de valeur
			obj=new BddSing(); 
		}
		
		// Retourne le résultat de l'objet
		return obj; 
	}
}
