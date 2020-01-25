package AccessSystem;

abstract class BadgeFactory {

    static Badge createBadge(String type) throws Exception {

        switch (type){
            case "StudentBadge":
                return new StudentBadge();
            case "FacultyBadge":
                return new FacultyBadge();
            case "AllAccessBadge":
                return new AllAccessBadge();
            default:
                throw new Exception("unknown badge type");
        }
    }
}
