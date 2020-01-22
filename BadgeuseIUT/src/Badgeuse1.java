import java.util.ArrayList;

public class Badgeuse1 implements ILecteurBadge{
	private ArrayList<ISyst> listeSyst = new ArrayList<ISyst>();
	
	public void access(Badge b) {
		int access = b.getTypeBadge();
		switch(access) {
			case 1:
				notifierSyst(b.getNomPrenom(), 1);
				break;
			case 2:
				notifierSyst(b.getNomPrenom(), 2);
				break; }
	}
	
	
	public void notifierSyst(ArrayList<String> s, int i) {for(ISyst sys : listeSyst) { sys.notifySyst(i, s);} }
	public void addSyst(ISyst arg0) { listeSyst.add(arg0);	}
	public void delSyst(ISyst agr0) { listeSyst.remove(agr0); }
	
}
