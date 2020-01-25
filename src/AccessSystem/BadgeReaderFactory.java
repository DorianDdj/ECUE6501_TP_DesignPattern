package AccessSystem;

abstract class BadgeReaderFactory {

    static BadgeReader createBadgeReader(String type, String location) throws Exception {

        switch (type){
            case "StudentBadgeReader":
                return new StudentBadgeReader(location);
            case "FacultyBadgeReader":
                return new FacultyBadgeReader(location);
            case "AllAccessBadgeReader":
                return new AllAccessBadgeReader(location);
            default:
                throw new Exception("unknown badge reader type");
        }
    }
}
