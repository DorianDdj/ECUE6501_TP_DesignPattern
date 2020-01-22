package AccessSystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.UUID;

public abstract class BadgeReader{
    private Integer accesslvl;
    private String id, location, event;
    private final PropertyChangeSupport pcs;

    BadgeReader(String type, String location) throws Exception {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.event = "Initialization";

        // adds AdminPanel and MainScreen as observers for each BadgeReader
        this.pcs = new PropertyChangeSupport(this);
        this.addPropertyChangeListener(AdminPanel.getInstance());
        this.addPropertyChangeListener(MainScreen.getInstance());

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

    private void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    // notify all observers of a badge scan
    void scanBadge(Badge b){
        String lastevent = this.event;
        if (b.getAccesslvl() <= this.accesslvl){
            this.event = b + allowAccess();
            this.pcs.firePropertyChange("event", lastevent, this.event);
        } else {
            this.event = b + denyAccess();
            this.pcs.firePropertyChange("event", lastevent, this.event);
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
