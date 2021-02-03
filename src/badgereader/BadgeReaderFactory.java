package badgereader;

public class BadgeReaderFactory {
	
    //use getShape method to get object of type shape 
    public BadgeReader getBadgeReader(String badgeReaderType) {
        if (badgeReaderType == null) {
            return null;
        }	

        if (badgeReaderType.equalsIgnoreCase("RED")) {
            return new RedBadgeReader(); 
        } else if(badgeReaderType.equalsIgnoreCase("BLUE")) {
            return new BlueBadgeReader();
        }
        
        return null;
    }
}