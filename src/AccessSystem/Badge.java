package AccessSystem;


import java.util.UUID;

public abstract class Badge {

    private Integer accesslvl;
    private String id, type;


    Badge(String type) throws Exception {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        switch(type){
            case "AllAccessBadge":
                this.accesslvl = 0;
                break;
            case "FacultyBadge":
                this.accesslvl = 1;
                break;
            case "StudentBadge":
                this.accesslvl = 2;
                break;
            default:
                throw new Exception("Unknown badge type");
        }
    }

    @Override
    public String toString() {
        return "Badge{" +
                "accesslvl=" + accesslvl +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    Integer getAccesslvl() {
        return accesslvl;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
