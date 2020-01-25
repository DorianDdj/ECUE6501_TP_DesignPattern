public class BadgeReaderFactory {

    public final static int READER_LAMBDA = 0;
    public final static int READER_DELTA = 1;

    //Methode de creation des badgeuses (Design Pattern "Factory")
    public static IBadgeReader create(int type) {
        switch(type) {
            case READER_LAMBDA :
                return new BadgeReaderLambda();
            case READER_DELTA:
                return new BadgeReaderDelta();
            default :
                return null;
        }
    }
}
