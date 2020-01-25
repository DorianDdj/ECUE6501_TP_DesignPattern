import java.util.ArrayList;
import java.util.List;

//MainSystem doit etre unique : Design Pattern "Singleton"
public class MainSystem {
    //Instance privee (Design Pattern "Singleton")
    private static MainSystem instance = null;

    //Liste des observers (Design Pattern "Observer")
    List<ISystemObserver> listSystems;

    //Methode d'acces a l'instance privee
    public static MainSystem getInstance() {
        if (instance == null) {
            instance = new MainSystem();
        }
        return instance;
    }

    //Constructeur prive
    private MainSystem() {
        listSystems = new ArrayList<>();
    }

    //Ajout des observers (Design Pattern "Observer")
    public void addScreen(ISystemObserver system) {
        if (system != null)
            listSystems.add(system);
    }

    //Suppression des observers (Design Pattern "Observer")
    public void removeScreen(ISystemObserver system) {
        if (system != null)
            listSystems.remove(system);
    }

    //Notification des observers (Design Pattern "Observer")
    public void notifyObservers(String name, String event) {
        for (ISystemObserver observer : listSystems) {
            observer.notifySystem(name, event);
        }
    }

    //Detection d'une action
    public void detectAction(IBadgeReader reader, Badge badge) {
        if (reader != null && badge != null) {
            //Transmission de l'action a la badgeuse
            Boolean access = reader.detectAction(badge);
            //Transmission de l'information aux systemes de gestion / affichage
            if (access) {
                notifyObservers(badge.getName(), "Access granted");
            }
            else {
                notifyObservers(badge.getName(), "Access denied");
            }
        }
    }
}
