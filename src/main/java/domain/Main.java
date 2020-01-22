package domain;

public class Main {
    public static void main(String[] args) {
        while (true) {
            final String question = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
            final int track = 5;
            try {
                RacingGame racingGame = new RacingGame(new CarList(new CustomScanner().getResponse(question)).getCarList(), track);
                racingGame.run();
                break;
            } catch (CarNameLengthException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
