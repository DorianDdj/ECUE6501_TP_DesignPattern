public class BadgeFactory {

    public final static int BADGE_STUDENT = 0;
    public final static int BADGE_TEACHER = 1;

    //Methode de creation des badges (Design Pattern "Factory")
    public static Badge create(int type, String name) {
        switch (type) {
            case BADGE_STUDENT:
                return new BadgeStudent(name);
            case BADGE_TEACHER:
                return new BadgeTeacher(name);
            default:
                return null;
        }
    }
}
