package view;

import domain.Track;

public class OutPut {

	private static final String NAME = " : ";
	private static final String DASH = "-";

	public String printTrack(final Track track) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(track.getCarName());
		buffer.append(NAME);
		for (int i = 0; i < track.getPosition(); i++) {
			buffer.append(DASH);
		}

		return buffer.toString();
	}

}
