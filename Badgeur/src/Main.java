
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte badge = new Carte();
		
		boolean controle = false;
		controle = badge.verifier("b19015806");
		
		if(controle == true) {
			System.out.println("Accer OK");			
		}
		else {
			System.out.println("Accer REFUSER!!!");
		}
		
		
		Factory factory = new Factory();
				
		IDroit badger = factory.creat(0, "z85232189");
		
		String id = badger.get_id();
		int droit = badger.get_droit();
		System.out.println("Badge a enrogistre dans la bdd:\n\tID: "+ id +"\n\tDroit: "+ droit);
	}

}
