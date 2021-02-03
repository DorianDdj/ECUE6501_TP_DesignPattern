package monitor;

import badge.Badge;
import badgereader.BadgeReader;

public class MainScreen extends Observer {

    public MainScreen(BadgeReader bg){
        this.bg = bg;
        this.bg.attach(this);
    }
  
    @Override
    public void update(Badge badge) {
        System.out.println("MainScreen: " + bg.getName() + " detected " + badge.getName() + " (" + badge.getClass() + ") " + ".");
    }
    
}
