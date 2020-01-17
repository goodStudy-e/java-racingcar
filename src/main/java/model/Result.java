package model;

import java.util.List;

import domain.Track;

public class Result {
	private static final int THREE_SECOND = 3000;
	public static void print(int times, List<Track> tracks) {
		for (int i = 0; i < times; i++) {

			for (Track track : tracks) {
				track.currentPosition();
				System.out.println(track.print());
			}
			
			threeJump();
			time();	
		}
	}
	
	private static void time() {
		
		try {
			Thread.sleep(THREE_SECOND);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void threeJump() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
