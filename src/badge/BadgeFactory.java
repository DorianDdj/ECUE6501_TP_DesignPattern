package badge;

public class BadgeFactory {
	
    //use getShape method to get object of type shape 
    public Badge getBadge(String badgeType, String name) {
       if (badgeType == null) {
          return null;
       }	

       if (badgeType.equalsIgnoreCase("STUDENT")) {
            return new StudentBadge(name); 
       } else if(badgeType.equalsIgnoreCase("TEACHER")) {
            return new TeacherBadge(name);
       }
       
       return null;
    }
 }