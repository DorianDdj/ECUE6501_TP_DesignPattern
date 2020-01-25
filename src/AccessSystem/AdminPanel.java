package AccessSystem;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

    public class AdminPanel implements PropertyChangeListener {

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
    /*
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("AdminPanel : \n " + observable + "\n " + o);
    }*/

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("MainScreen :\n " + propertyChangeEvent.getSource() + "\n " + propertyChangeEvent.getNewValue());
    }
    }
