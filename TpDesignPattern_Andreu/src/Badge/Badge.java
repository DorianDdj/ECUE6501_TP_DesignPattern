package Badge;

import Acces.DataBaseSingleton;

import java.util.UUID;

public abstract class Badge{

    private String id = UUID.randomUUID().toString();
    String name;

    public String getId(){
        return this.id;
    }

    public Boolean verifyAcces(){
        return DataBaseSingleton.getInstance().authorizedAcces(this);
    }

    private String getName(){
        if (this.name != null){
            return this.name;
        }
        return "Error";
    }

    public abstract void setName(String name);
}
