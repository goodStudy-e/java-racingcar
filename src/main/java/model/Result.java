package model;

import java.util.List;

import domain.Track;
import view.OutPut;

public class Result {
	private static final int THREE_SECONDS = 3000;

	public static void print(int times, List<Track> tracks) {
		for (int i = 0; i < times; i++) {

			printTrack(tracks);
			delayPrint();
		}
	}

	private static void printTrack(List<Track> tracks) {
		for (Track track : tracks) {
			track.increasePoint();
			System.out.println(new OutPut().printTrack(track));
		}
		threeJump();
	}

	private static void delayPrint() {
		try {
			Thread.sleep(THREE_SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void threeJump() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
