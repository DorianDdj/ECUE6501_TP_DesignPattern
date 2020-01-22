
public class FactoryBadges 

{

	public InterfaceBadges getBadge(String arg)
	{
		if (arg=="Etudiant")
		{
			Etudiants etudiant=new Etudiants();
			System.out.println("Il s'agit d'un étudiant");
			return etudiant;
		}
		else if (arg=="Enseignant")
		{   
			Enseignants enseignant=new Enseignants();
			System.out.println("Il s'agit d'un enseignant");
			return enseignant;
		}
		
		else
		{
			System.out.println("Incorrect !");
		}
			
		return null;
	}
	

}
