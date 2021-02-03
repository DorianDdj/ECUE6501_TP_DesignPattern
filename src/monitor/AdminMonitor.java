package monitor;

import badge.Badge;
import badgereader.BadgeReader;

public class AdminMonitor extends Observer {

    public AdminMonitor(BadgeReader bg){
        this.bg = bg;
        this.bg.attach(this);
    }
  
    @Override
    public void update(Badge badge) {
        System.out.println("AdminMonitor: " + bg.getName() + " detected " + badge.getName() + " (" + badge.getClass() + ") " + ".");
    }

}
