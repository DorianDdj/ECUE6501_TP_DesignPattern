
public class Eleve implements IDroit{
	String badge_id;
	int badge_droit;

	@Override
	public void set_id(String id) {
		// TODO Auto-generated method stub
		badge_id = id;
	}

	@Override
	public void set_droit() {
		// TODO Auto-generated method stub
		badge_droit = 1;
	}

	@Override
	public String get_id() {
		// TODO Auto-generated method stub
		return badge_id;
	}

	@Override
	public int get_droit() {
		// TODO Auto-generated method stub
		return badge_droit;
	}

}
