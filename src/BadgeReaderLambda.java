public class BadgeReaderLambda implements IBadgeReader {
    @Override
    public Boolean detectAction(Badge badge) {
        //A chaque action, on demande a la base de donnee si l'access est autorise
        return AccessDatabase.getInstance().isAccessGranted(badge.getName());
    }
}
