package Observer;

import Badge.Badge;

abstract class Observer {
    Badge badge;
    abstract void notifyChildren();
}
