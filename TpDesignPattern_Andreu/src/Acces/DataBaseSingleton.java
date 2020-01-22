package Acces;

import Badge.Badge;
import Observer.ObserverSingleton;

import java.util.ArrayList;
import java.util.List;

public class DataBaseSingleton {

    private static DataBaseSingleton instance = new DataBaseSingleton();

    private List<String> badgeAuthorized = new ArrayList<>();

    private DataBaseSingleton(){}

    public static DataBaseSingleton getInstance(){
        return instance;
    }

    public void addNewBadgeCode(Badge badge){
        badgeAuthorized.add(badge.getId());
    }


    public boolean authorizedAcces(Badge badge){
        ObserverSingleton.getInstance().getIdOFBadgeWhenUserWantToGoOn(badge);
        ObserverSingleton.getInstance().notifyChildren();
        return badgeAuthorized.contains(badge.getId());
    }
}
