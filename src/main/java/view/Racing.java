package view;

import java.util.List;
import java.util.Scanner;

import controller.Winner;
import domain.Track;

public class Racing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차를 입력해주세요.(자동차는 `,`로 구분됩니다.)");
		Input input = new Input();

		List<Track> tracks = input.registTrack(input.registCar(input.toSetForArray(input.spliteComma(sc.nextLine()))));

		System.out.println("몇 번 반복하시겠습니까? ");
		int times = sc.nextInt();
		Output.print(times, tracks);

	
		System.out.println(new Winner().winner(tracks));
	}
}
