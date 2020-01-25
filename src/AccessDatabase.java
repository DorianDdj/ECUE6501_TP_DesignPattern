import java.util.ArrayList;

//AccessDatabase doit etre unique : Design Pattern "Singleton"
public class AccessDatabase {
    //Instance privee (Design Pattern "Singleton")
    private static AccessDatabase instance = null;

    //Methode d'acces a l'instance privee
    public static AccessDatabase getInstance() {
        //Si l'instance n'existe pas (premier access), on l'instancie
        if (instance == null) {
            instance = new AccessDatabase();
        }
        return instance;
    }

    //Constructeur prive
    private AccessDatabase() {
    }

    //Verification des autorisations
    public Boolean isAccessGranted(String name) {
        return true; //Toujours vrai pour l'exemple!
    }
}
