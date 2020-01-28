package domain;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {

	private final static String WIN_PLAYER_IS = "승리자는 ";
	private final static String END = "입니다.";
	private final static int FIRST = 0;
	private final static String COMMA = ",";

	private int winCount(List<Track> tracks) {
		int max = tracks.get(FIRST).getPosition();
		
		for (Track track : tracks) {
			int current = track.getPosition();
			if (max < current) {
				max = current;
			}
		}
		return max;
	}

	private List<String> addWinPlayer(List<Track> tracks, int max) {
		return tracks.stream()
				.filter(track -> track.getPosition() == max)
				.map(track-> track.getCarName())
				.collect(toList());
	}

	public String winner(List<Track> tracks) {
		int max = winCount(tracks);
		return WIN_PLAYER_IS + addWinPlayer(tracks, max)
		  .stream()
		  .collect(Collectors
				.joining(COMMA)) + END;
	}

}
