
public class FactoryBadgeuse 

{

	public InterfaceBadgeuse getBadgeuse(String arg)
	{
			
		if (arg=="T1")
		{
			
			BadgeuseT1 badgeuse=new BadgeuseT1();
			System.out.println("Badgeuse de Type 1");
			return badgeuse;
		}
		
		else if (arg=="T2")
		{
			BadgeuseT2 badgeuse=new BadgeuseT2();
			System.out.println("Badgeuse de Type 2");
			return badgeuse;
		}
		
		else 
		{
			System.out.println("Incorrect !");
		}
		return null;
			
	}
	


	
	

}
