package Observer;

import Badge.Badge;

import java.util.ArrayList;
import java.util.List;

public class ObserverSingleton {

    private static ObserverSingleton instance = new ObserverSingleton();

    private List<Observer> observers = new ArrayList<>();

    private ObserverSingleton(){}

    public static ObserverSingleton getInstance(){
        return instance;
    }

    public void getIdOFBadgeWhenUserWantToGoOn(Badge badge){
        for (Observer obs : observers ){
            obs.badge = badge;
        }
    }

    public void notifyChildren(){
        for (Observer obs : observers ){
            obs.notifyChildren();
        }
    }

    void attach(Observer observer){
        this.observers.add(observer);
    }
}
