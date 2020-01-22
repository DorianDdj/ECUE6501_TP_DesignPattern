package AccessSystem;

import java.util.Observable;
import java.util.Observer;

public class AdminPanel implements Observer {

    private static AdminPanel instance = null;

    private String s;

    private AdminPanel(){
        s = "AdminPanel";
    }

    static AdminPanel getInstance() {
        if (instance == null) {
            instance = new AdminPanel();
        }
        return instance;
    }
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("AdminPanel : \n " + observable + "\n " + o);
    }
}
