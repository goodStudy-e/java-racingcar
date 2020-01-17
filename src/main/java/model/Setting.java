package model;

import static java.util.stream.Collectors.toList;

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
		return toSetForArray(str)
				.stream()
				.map(Car :: new)
				.collect(toList());
		}

	public List<Track> regist(String str) {
		return registCar(str)
				.stream()
				.map(Track :: new)
				.collect(toList());
		
	}
}
