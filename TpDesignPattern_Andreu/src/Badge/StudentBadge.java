package Badge;


import Observer.ObserverSingleton;

public class StudentBadge extends Badge{

    @Override
    public void setName(String name) {
        this.name = "Student :" + name;
    }
}
