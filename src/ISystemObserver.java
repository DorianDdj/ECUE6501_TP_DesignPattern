//System observer (Design Pattern "Observer")
public interface ISystemObserver {
    //Notification du system, appele par le sujet
    public void notifySystem(String name, String action);
}
