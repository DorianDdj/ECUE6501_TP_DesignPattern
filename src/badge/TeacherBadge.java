package badge;

public class TeacherBadge implements Badge {

    String name;

    public TeacherBadge(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

}
