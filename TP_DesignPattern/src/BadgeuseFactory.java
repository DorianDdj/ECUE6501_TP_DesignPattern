
public class BadgeuseFactory {
	public static IBadgeuse createBadgeuse(int type) {
		if(type == 0) //BadgeuseA
			return new BadgeuseA();
		if(type == 1) //BadgeuseB
			return new BadgeuseB();
		return null;
	}
}
