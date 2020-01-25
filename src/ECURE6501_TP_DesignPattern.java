public class ECURE6501_TP_DesignPattern {

    /**
     * Sujet : manipulation des Design Pattern "Singleton", "Observer", "Factory"
     * La badgeuse permet d'entrer dans l'IUT
     * Une base de données contient les droits d'accès (non implémentée, remplacée par une classe)
     * Deux sortes de badgeuses existent
     * Deux sortes de badges existent : étudiants et enseignants
     * Deux systèmes sont notifiés lorsque quelqu'un badge : écran principal et supervision de l'administrateur
     */

    public static void main(String[] args) {

        /*
          L'implementation suivante est un exemple d'implementation,
          utilisant les design pattern etudies
          Il ne s'agit pas de la seule possibilite, ni meme de la meilleure!
          Par exemple, l'ensemble des objets est cree dans le main pour simplifier
          la lecture, mais il faudrait deleguer au systeme la creation des badgeuses,
          creer les badges en fonction du contenu de la base de donnees, etc.

          Pour l'exemple, les deux factory ne sont pas identiques :
          - la factory pour les badgeuses une utilise une interface
          - la factory pour les badges utilise un héritage
         */

        //Creation de deux badgeuses en utilisant une Factory
        IBadgeReader entrance = BadgeReaderFactory.create(BadgeReaderFactory.READER_LAMBDA);
        IBadgeReader storage  = BadgeReaderFactory.create(BadgeReaderFactory.READER_DELTA);

        //Creation de badges etudiants et enseignants en utilisant une Factory
        Badge studentJulien  = BadgeFactory.create(BadgeFactory.BADGE_STUDENT, "Julien");
        Badge studentEstelle = BadgeFactory.create(BadgeFactory.BADGE_STUDENT, "Estelle");
        Badge teacherLivia = BadgeFactory.create(BadgeFactory.BADGE_TEACHER, "Livia");
        Badge teacherJerome = BadgeFactory.create(BadgeFactory.BADGE_TEACHER, "Jerome");

        //Creation des afficheurs
        MainScreen mainScreen = new MainScreen();
        AdminSupervision adminSupervision = new AdminSupervision();

        //Le systeme principal notifie les afficheurs a chaque action (Design Pattern Observer)
        MainSystem.getInstance().addScreen(mainScreen);
        MainSystem.getInstance().addScreen(adminSupervision);

        //On simule une action : un badge sur une badgeuse
        MainSystem.getInstance().detectAction(entrance, teacherJerome);
        MainSystem.getInstance().detectAction(storage, studentEstelle);
    }
}
