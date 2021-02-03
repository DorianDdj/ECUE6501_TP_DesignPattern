package badgereader;

import badge.Badge;

public class BlueBadgeReader extends BadgeReader {

    @Override
    public void read(Badge badge) {
        updateAllObservers(badge);
    }

    @Override
    public String getName() {
        return "BlueBadgeReader";
    }

}
