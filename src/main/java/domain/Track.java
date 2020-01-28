package domain;

public class Track {


	private final Car car;
	private int position;

	public Track(final Car car) {
		this.car = car;
	}

	public void increasePoint() {
		position += car.increaseStep();
	}


	public int getPosition() {
		return position;
	}

	public String getCarName() {
		return car.getName();
	}
}
