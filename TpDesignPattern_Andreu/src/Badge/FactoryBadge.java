package Badge;

public class FactoryBadge {

    public Badge getBadge(String badgeName) {
        if (badgeName.equalsIgnoreCase("STUDENT")){
            return new StudentBadge();
        }
        if (badgeName.equalsIgnoreCase("TEACHER")){
            return new TeacherBadge();
        }

        return null;
    }
}
