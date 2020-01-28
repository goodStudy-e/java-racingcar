package model;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.Car;
import domain.Track;

public class UserInputHelper {

	private static final String COMMA = ",";

	public List<Track> register(String str) {
		return registCar(str).stream().map(Track::new).collect(toList());

	}

	private List<Car> registCar(String str) {
		return toSetForArray(str).stream().map(Car::new).collect(toList());
	}

	private Set<String> toSetForArray(String str) {
		return new HashSet<>(Arrays.asList(splitComma(str)));
	}

	private String[] splitComma(String str) {
		return str.split(COMMA);
	}

}
