package view;

import java.util.List;
import java.util.Scanner;

import domain.Track;
import domain.Winner;
import model.Result;
import model.UserInputHelper;

public class Racing {

	private static final String INPUT_CARS_MSG = "자동차를 입력해주세요.(자동차는 `,`로 구분됩니다.)";
	private static final String HOW_MANY_COUNT_MSG = "몇 번 반복하시겠습니까? ";
	
	private Scanner sc = new Scanner(System.in);

	private List<Track> inputCars() {
		System.out.println(INPUT_CARS_MSG);
		UserInputHelper racing = new UserInputHelper();
		return racing.register(sc.nextLine());
	}

	private void repeatCall(List<Track> inputCars) {
		System.out.println(HOW_MANY_COUNT_MSG);
		int times = sc.nextInt();
		Result.print(times, inputCars);
	}

	private void printWinner(List<Track> inputCars) {
		System.out.println(new Winner().winner(inputCars));
	}


	public void playTheGame() {
		List<Track> inputCars = inputCars();
		repeatCall(inputCars);
		printWinner(inputCars);
	}
}
