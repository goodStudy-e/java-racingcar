package view;

import java.util.List;
import java.util.Scanner;

import controller.Winner;
import domain.Track;
import model.Result;
import model.Setting;

public class Racing {

	private final static String INPUTCARS = "자동차를 입력해주세요.(자동차는 `,`로 구분됩니다.)";
	private final static String HOWMANYCOUNT = "몇 번 반복하시겠습니까? ";
	private Scanner sc = new Scanner(System.in);

	private List<Track> inputCars() {
		System.out.println(INPUTCARS);
		Setting setting = new Setting();
		return setting.regist(sc.nextLine());
	}

	private void callRepeat(List<Track> inputCars) {
		System.out.println(HOWMANYCOUNT);
		int times = sc.nextInt();
		Result.print(times, inputCars);
	}

	private void printWinner(List<Track> inputCars) {
		System.out.println(new Winner().winner(inputCars));
	}


	public void playTheGame() {
		List<Track> inputCars = inputCars();
		callRepeat(inputCars);
		printWinner(inputCars);
	}
}
