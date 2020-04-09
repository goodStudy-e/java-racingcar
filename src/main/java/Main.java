import Controller.RacingGameSystem;

public class Main {

    public static void main(String[] args) {
        RacingGameSystem racingGameSystem = new RacingGameSystem();
        racingGameSystem.generateCars();
        racingGameSystem.play();
        racingGameSystem.noticeWinner();
    }
}
