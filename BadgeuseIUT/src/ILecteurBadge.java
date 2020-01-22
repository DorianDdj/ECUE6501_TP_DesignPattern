import java.util.ArrayList;

public interface ILecteurBadge {
	public void notifierSyst(ArrayList<String> s, int i); // Deux systèmes sont notifiés lorsque quelqu'un badge : écran principal et supervision de l'administrateur
	public void addSyst(ISyst arg0);
	public void delSyst(ISyst agr0);
	
	public void access(Badge b);
	
}
