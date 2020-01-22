import java.util.ArrayList;

public class Syst implements ISyst {
	public void notifySyst(int i,ArrayList<String> s) {
		System.out.println(this+": type accès:" + i + " est entré. (" + s.get(1)+", "+s.get(0)+").");
	}
}
