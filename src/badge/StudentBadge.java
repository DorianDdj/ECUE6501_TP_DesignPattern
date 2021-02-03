package badge;

public class StudentBadge implements Badge {

    String name;

    public StudentBadge(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

}
