package System;

import Badge.Badge;
import Badgeuse.Badgeuse;

public interface IObserver {
	
	//appelé par la classe observée
	void notify(Badge badge);
}
