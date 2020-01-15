package controller;

import java.util.List;

import domain.Track;

public class Winner {

	private int winCount(List<Track> tracks) {
		int max = tracks.get(0).getPosition();
		for (Track track : tracks) {
			int current = track.getPosition();
			if (max < current) {
				max = current;
			}
		}
		return max;
	}

	public String winner(List<Track> tracks) {
		int max = winCount(tracks);

		String winner = "승리자는 ";
		for (Track track : tracks) {

			if (max == track.getPosition()) {
				winner += String.join(",", track.getCar().getName());
			}
		}

		return winner += "입니다.";
	}
}
