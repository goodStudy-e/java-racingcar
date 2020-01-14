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
		for (int i = 0; i < position; i++) {
			buffer.append("-");
		}
		
		return buffer.toString();
	}
}
