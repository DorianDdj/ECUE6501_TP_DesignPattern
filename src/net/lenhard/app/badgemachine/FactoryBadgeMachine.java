package net.lenhard.app.badgemachine;

public class FactoryBadgeMachine {
	public BadgeMachine getBadgeMachine(BadgeMachineType type) {
		BadgeMachine badgeMachine = null;

		switch (type) {
			case FIRST:
				badgeMachine = new FirstBadgeMachine();
				break;

			case SECOND:
				badgeMachine = new SecondBadgeMachine();
				break;
		
			default:
				System.err.println("This type of badge does not exist!");
				break;
		}

		return badgeMachine;
	}
}
