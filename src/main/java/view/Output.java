package view;

import java.util.List;

import domain.Track;

public class Output {
	public static void print(int times, List<Track> tracks) {
		for (int i = 0; i < times; i++) {

			for (Track track : tracks) {
				track.currentPosition();
				System.out.println(track.print());
			}
			
			threeJump();
		}
	}
	
	private static void threeJump() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
