package domain;

public class Main {
    public static void main(String[] args) {
        final String question ="경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
        new CustomScanner().getResponse(question);
    }
}
