package badgereader;

import java.util.ArrayList;
import java.util.List;
import monitor.Observer;
import badge.Badge;

public abstract class BadgeReader {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);		
    }

    public void detach(Observer observer) {
        observers.remove(observer);		
    }

    public void updateAllObservers(Badge badge) {
        for (Observer observer : observers) {
           observer.update(badge);
        }
    }

    public void read(Badge badge) {}

    public String getName() {
        return "BadgeReader";
    }

}
