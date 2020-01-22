
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte badge = new Carte();
		
		boolean controle = false;
		controle = badge.verifier("b19015806");
		
		if(controle == true) {
			
		}
		else {
			System.out.println("Accer REFUSER!!!");
		}
		
//		File f = new File("BDD");
//		try (Scanner input = new Scanner(f))
//		{
//			String i = input.next();
//			System.out.println(i);
//		}	
//		catch(FileNotFoundException e)
//		{
//			System.err.println("Pas de ficher " + f );
//		}
	}

}
