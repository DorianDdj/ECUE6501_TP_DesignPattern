package AccessSystem;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AccessSystem {

    private static AccessSystem instance = null;

    private String name;
    private ArrayList<Badge> badges;
    private ArrayList<BadgeReader> badgereaders;

    private AccessSystem(){
        name = "IUT Access System";
        badges = new ArrayList<>();
        badgereaders = new ArrayList<>();
    }

    static AccessSystem getInstance() {
        if (instance == null) {
            instance = new AccessSystem();
        }
        return instance;
    }

    void addBadge(Badge b){
        badges.add(b);
    }

    public void removeBadge(Badge b){
        badges.remove(b);
    }

    void addBadgeReader(BadgeReader b){
        badgereaders.add(b);
    }

    public void removeBadgeReader(BadgeReader b){
        badgereaders.remove(b);
    }

    Badge getRandomBadge(){
        return badges.get(ThreadLocalRandom.current().nextInt(badges.size() - 1));
    }

    BadgeReader getRandomBadgeReader(){
        return badgereaders.get(ThreadLocalRandom.current().nextInt(badgereaders.size() - 1));
    }

    @Override
    public String toString() {
        return "AccessSystem{" +
                "name=" + name +
                "badges=" + badges +
                "badge readers=" + badgereaders +
                '}';
    }
}
