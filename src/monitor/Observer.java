package monitor;

import badgereader.BadgeReader;
import badge.Badge;

public abstract class Observer {
    protected BadgeReader bg;
    public abstract void update(Badge badge);
}
