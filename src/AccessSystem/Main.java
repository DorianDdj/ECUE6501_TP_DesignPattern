package AccessSystem;

public class Main {
    public static void main(String[] args) {
        try {
            var system = AccessSystem.getInstance();

            // Création de badges via BadgeFactory et ajout de ces badges dans le système

            system.addBadge(BadgeFactory.createBadge("StudentBadge"));
            system.addBadge(BadgeFactory.createBadge("AllAccessBadge"));
            system.addBadge(BadgeFactory.createBadge("FacultyBadge"));
            system.addBadge(BadgeFactory.createBadge("FacultyBadge"));
            system.addBadge(BadgeFactory.createBadge("FacultyBadge"));
            system.addBadge(BadgeFactory.createBadge("StudentBadge"));
            system.addBadge(BadgeFactory.createBadge("StudentBadge"));
            system.addBadge(BadgeFactory.createBadge("StudentBadge"));
            system.addBadge(BadgeFactory.createBadge("AllAccessBadge"));

            // Création de badgeuses via BadgeReaderFactory et ajout de ces badgeuses dans le système

            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Front Door"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Cafeteria"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Classroom A1"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Classroom A2"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Classroom A3"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Classroom A4"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("StudentBadgeReader", "Classroom B2"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("FacultyBadgeReader", "Faculty Room A"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("FacultyBadgeReader", "Faculty Room B"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("FacultyBadgeReader", "Faculty Room C"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("AllAccessBadgeReader", "Server Room"));
            system.addBadgeReader(BadgeReaderFactory.createBadgeReader("AllAccessBadgeReader", "Roof"));


            // On scanne un badge aléatoire sur une badgeuse aléatoire

            system.getRandomBadgeReader().scanBadge(system.getRandomBadge());


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
