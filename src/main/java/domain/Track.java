package domain;

public class Track {

	private final static String NAME = " : ";
	private final static String DASH = "-";

	private final Car car;
	private int position;

	public Track(final Car car) {
		this.car = car;
	}

	public void currentPosition() {
		position += car.increaseStep();
	}

	public String print() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(car.getName());
		buffer.append(NAME);
		for (int i = 0; i < position; i++) {
			buffer.append(DASH);
		}

		return buffer.toString();
	}

	public int getPosition() {
		return position;
	}

	public Car getCar() {
		return car;
	}
}
