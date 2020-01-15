package domain;

public class Track {

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
		buffer.append(" : ");
		for (int i = 0; i < position; i++) {
			buffer.append("-");
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
