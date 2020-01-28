package domain;

import java.util.Random;

/**
 * @ClassName Car
 * 
 * @Version 2.0.0
 * 
 * @Date 20200115
 * 
 * @author asqwklop12
 * 
 * @email asqwklop12@gmail.com
 *
 */
public class Car {

	private final static int SEED = 10;
	private final static int PAUSE = 5;
	private final static int UP = 1;
	private final static int NOT = 0;
	private final String name;

	public Car(final String name) {
		this.name = name;
	}

	private int randomStep() {
		return new Random().nextInt(SEED);
	}

	private boolean currentState() {
		return randomStep() < PAUSE ? false : true;
	}

	public String getName() {
		return name;
	}

	public int increaseStep() {
		return currentState() ? UP : NOT;
	}
}