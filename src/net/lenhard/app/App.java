package net.lenhard.app;

import net.lenhard.app.badge.StudentBadge;
import net.lenhard.app.badge.TeacherBadge;
import net.lenhard.app.badgemachine.FirstBadgeMachine;
import net.lenhard.app.badgemachine.SecondBadgeMachine;

public class App {
	public static void main(String[] args) {
		AdminSupervision as = new AdminSupervision();
		MainScreen ms = new MainScreen();

		FirstBadgeMachine fbm = new FirstBadgeMachine();
		SecondBadgeMachine sbm = new SecondBadgeMachine();

		fbm.addObserver(as);
		fbm.addObserver(ms);
		sbm.addObserver(as);
		sbm.addObserver(ms);

		StudentBadge sb1 = new StudentBadge("Lucas", "Guerin", "L1");
		StudentBadge sb2 = new StudentBadge("Tom", "Sky", "L2");
		StudentBadge sb3 = new StudentBadge("Olivier", "Eittam", "L3");

		TeacherBadge tsb1 = new TeacherBadge("Laurent", "Solo", "C4");
		TeacherBadge tsb2 = new TeacherBadge("Bruno", "Aegis", "T4AP");

		fbm.read(sb1);
		fbm.read(sb2);
		sbm.read(sb3);
		sbm.read(tsb1);
		fbm.read(tsb2);
	}
}
