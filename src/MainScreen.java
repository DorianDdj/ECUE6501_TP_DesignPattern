public class MainScreen implements ISystemObserver {
    //Notification, appelee par le sujet observé (Design Pattern "Observer")
    @Override
    public void notifySystem(String name, String action) {
        System.out.println("Main screen, New information : '" + name + "' -> " + action);
    }
}
