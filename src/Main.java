import badge.Badge;
import badge.BadgeFactory;
import badgereader.BadgeReader;
import badgereader.BadgeReaderFactory;
import badgereader.RedBadgeReader;
import monitor.AdminMonitor;
import monitor.MainScreen;

public class Main {
    public static void main(String[] args) {
        BadgeFactory badgeFactory = new BadgeFactory();
        Badge thomasBadge = badgeFactory.getBadge("STUDENT", "Thomas");
        Badge lucasBadge = badgeFactory.getBadge("STUDENT", "Lucas");
        Badge michelBadge = badgeFactory.getBadge("TEACHER", "Michel");
        
        BadgeReaderFactory badgeReaderFactory = new BadgeReaderFactory();
        BadgeReader redBadgeReader = badgeReaderFactory.getBadgeReader("RED");
        BadgeReader blueBadgeReader = badgeReaderFactory.getBadgeReader("BLUE");

        MainScreen mainScreen = new MainScreen(redBadgeReader);
        redBadgeReader.attach(mainScreen);
        AdminMonitor adminMonitor = new AdminMonitor(blueBadgeReader);
        blueBadgeReader.attach(adminMonitor);

        redBadgeReader.read(thomasBadge);
        redBadgeReader.read(lucasBadge);

        blueBadgeReader.read(michelBadge);
        blueBadgeReader.read(thomasBadge);
        blueBadgeReader.read(lucasBadge);
        
        redBadgeReader.read(michelBadge);
    }
}
