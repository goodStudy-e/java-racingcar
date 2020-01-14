package domain;

import static org.assertj.core.api.Assertions.assertThat;

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
		Car car1 = new Car("youn");
		Car car2 = new Car("king");
		Car car3 = new Car("quean");
		Car car4 = new Car("white");
		Car car5 = new Car("black");
		
		Track track1 = new Track(car1);
		Track track2 = new Track(car2);
		Track track3 = new Track(car3);
		Track track4 = new Track(car4);
		Track track5 = new Track(car5);

		for (int i = 0; i < 5; i++) {
			track1.currentPosition();
			track2.currentPosition();
			track3.currentPosition();
			track4.currentPosition();
			track5.currentPosition();
			
			System.out.println(car1.getName() + ":" + track1.print());
			System.out.println(car2.getName() + ":" + track2.print());
			System.out.println(car3.getName() + ":" + track3.print());
			System.out.println(car4.getName() + ":" + track4.print());
			System.out.println(car5.getName() + ":" + track5.print());
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			Thread.sleep(3000);
		}

		
	}
	
}
