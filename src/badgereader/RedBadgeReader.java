package badgereader;

import badge.Badge;

public class RedBadgeReader extends BadgeReader {

    @Override
    public void read(Badge badge) {
        updateAllObservers(badge);
    }

    @Override
    public String getName() {
        return "RedBadgeReader";
    }
    
}