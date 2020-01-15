package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.Car;
import domain.Track;

public class Input {

	public String[] spliteComma(String str) {
		return str.split(",");
	}

	public Set<String> toSetForArray(String[] arr) {
		Set<String> carNames = new HashSet<>();
		for (String str : arr) {
			carNames.add(str);
		}
		return carNames;
	}

	public List<Car> registCar(Set<String> carNames) {
		List<Car> cars = new ArrayList<>();
		for (String name : carNames) {
			Car car = new Car(name);
			cars.add(car);
		}

		return cars;
	}

	public List<Track> registTrack(List<Car> cars) {
		List<Track> tracks = new ArrayList<Track>();
		for (Car car : cars) {
			Track track = new Track(car);
			tracks.add(track);
		}
		
		return tracks;
	}
}
