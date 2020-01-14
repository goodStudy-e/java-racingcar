package domain;

import java.util.Random;

/**
 * @ClassName Car
 * 
 * @Version 1.0.0
 * 
 * @Date 20191210
 * 
 * @author asqwklop12
 * 
 * @email asqwklop12@gmail.com
 *
 */
public class Car {

	private final String name;

	public Car(final String name) {
		this.name = name;
	}


	private int randomStep() {
		return new Random().nextInt(10) + 1;
	}

	private boolean currentState() {
		int state = randomStep();
		if (state < 5) {
			return false;
		}
		return true;
	}

	public String getName() {
		return name;
	}
	public int increaseStep() {
		return currentState() ? 1 : 0;
	}
}