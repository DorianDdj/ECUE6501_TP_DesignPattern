
public class FactoryLecteurBadge {
	public ILecteurBadge createBadgeuse (int type) {
		switch(type) {
		case 1:
			Badgeuse1 b1 = new Badgeuse1();
			return b1;
		case 2:
			Badgeuse2 b2 = new Badgeuse2();
			return b2;
		}
		return null;
	} 
}
