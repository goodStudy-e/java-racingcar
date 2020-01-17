package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.Car;
import domain.Track;

public class Setting {

	private final static String COMMA = ",";

	private String[] splitComma(String str) {
		return str.split(COMMA);
	}

	private Set<String> toSetForArray(String str) {
		return new HashSet<>(Arrays.asList(splitComma(str)));
	}

	private List<Car> registCar(String str) {
		List<Car> cars = new ArrayList<>();
		for (String name : toSetForArray(str)) {
			Car car = new Car(name);
			cars.add(car);
		}

		return cars;
	}

	public List<Track> regist(String str) {
		List<Track> tracks = new ArrayList<>();
		for (Car car : registCar(str)) {
			Track track = new Track(car);
			tracks.add(track);
		}

		return tracks;
	}
}
