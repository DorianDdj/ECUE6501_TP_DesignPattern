package AccessSystem;

import java.util.Observable;
import java.util.UUID;

public abstract class BadgeReader extends Observable {
    private Integer accesslvl;
    private String id, location;

    BadgeReader(String type, String location) throws Exception {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.addObserver(AdminPanel.getInstance());
        this.addObserver(MainScreen.getInstance());
        switch(type){
            case "AllAccessBadgeReader":
                this.accesslvl = 0;
                break;
            case "FacultyBadgeReader":
                this.accesslvl = 1;
                break;
            case "StudentBadgeReader":
                this.accesslvl = 2;
                break;
            default:
                throw new Exception("Unknown badge reader type");
        }
    }

    void scanBadge(Badge b){
        if (b.getAccesslvl() <= this.accesslvl){
            setChanged();
            notifyObservers( b + allowAccess());
        } else {
            setChanged();
            notifyObservers( b + denyAccess());
        }
    }

    private String allowAccess(){
        return "\nAccess Authorized, you can now access " + this.location;
    }

    private String denyAccess(){
        return "\nAccess denied, you do not have the necessary permissions to access " + this.location;
    }

    @Override
    public String toString() {
        return "BadgeReader{" +
                "accesslvl=" + accesslvl +
                ", id='" + id + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
