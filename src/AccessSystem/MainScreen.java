package AccessSystem;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class MainScreen implements PropertyChangeListener {

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
    /*
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("MainScreen : \n " + observable + "\n " + o);
    }*/

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("MainScreen :\n " + propertyChangeEvent.getSource() + "\n " + propertyChangeEvent.getNewValue());
    }
}
