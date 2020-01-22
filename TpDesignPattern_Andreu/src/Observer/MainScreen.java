package Observer;

public class MainScreen extends Observer {

    public MainScreen(){
        ObserverSingleton.getInstance().attach(this);
    }

    @Override
    void notifyChildren() {
        System.out.println("MainScreen : Somebody wants to go in.");
    }
}
