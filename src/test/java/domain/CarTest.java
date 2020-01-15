package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	public void oneCarDrive() {
		Car car = new Car("youn");
		Track track = new Track(car);

		for (int i = 0; i < 5; i++) {
			track.currentPosition();
		}

	}

	@Test
	public void fiveCarDrive() throws InterruptedException {
		Set<String> strs = new HashSet<>();
		
		strs.add("youn");
		strs.add("youn");
		strs.add("king");
		strs.add("quean");
		strs.add("white");
		strs.add("black");
		List<Car> cars = new ArrayList<>();
		
		for (String str : strs) {
			Car car = new Car(str);	
			cars.add(car);
		}

		List<Track> tracks = new ArrayList<Track>();

		for (Car car : cars) {
			Track track = new Track(car);
			tracks.add(track);
		}


		for (int i = 0; i < 5; i++) {

			for (Track track : tracks) {
				track.currentPosition();
				System.out.println(track.print());
			}
			System.out.println();
			System.out.println();
			System.out.println();

			Thread.sleep(3000);

		}

	}

}
