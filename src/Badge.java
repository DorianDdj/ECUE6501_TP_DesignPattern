import java.util.UUID;

//Badge generique
public class Badge {
    private String m_name;
    private UUID m_id;

    //Constructeur
    public Badge(String name) {
        m_name = name;
        m_id = UUID.randomUUID(); //Creation d'un identifiant unique aleatoire
    }

    //Accesseur du nom
    public String getName() {
        return m_name;
    }

    //Accesseur de l'identifiant
    public String getId() {
        return m_id.toString();
    }
}
