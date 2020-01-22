package Observer;

public class AdminScreen extends Observer {

    public AdminScreen(){
        ObserverSingleton.getInstance().attach(this);
    }

    @Override
    void notifyChildren() {
        System.out.println("AdminScreen : Somebody wants to go in with id :" + badge.getId());
    }
}
