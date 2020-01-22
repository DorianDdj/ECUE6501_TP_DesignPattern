package AccessSystem;

import java.util.Observable;
import java.util.Observer;

public class MainScreen implements Observer {

    private static MainScreen instance = null;

    private String s;

    private MainScreen(){
        s = "MainScreen";
    }

    static MainScreen getInstance() {
        if (instance == null) {
            instance = new MainScreen();
        }
        return instance;
    }
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("MainScreen : \n " + observable + "\n " + o);
    }
}
