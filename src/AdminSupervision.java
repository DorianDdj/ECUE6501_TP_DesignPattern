public class AdminSupervision implements ISystemObserver {
    //Notification, appelee par le sujet observé (Design Pattern "Observer")
    @Override
    public void notifySystem(String name, String action) {
        System.out.println("Admin supervision, New information : '" + name + "' -> " + action);
    }
}
