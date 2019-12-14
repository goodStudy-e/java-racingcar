/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */
package domain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 클래스 이름: RacingGame.java
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.13 (금)
 * @version 1.0.0
 */
public class RacingGame {
    private int carNumber;
    private ArrayList<Car> carList;
    private final int MAX_TIMESTEP = 5;
    private final int LIMIT_CARNUMBER = 2;

    /**
     * 자동차경주를 시작하는 메서드
     */
    public void playRacingGame() {
        Scanner input = new Scanner(System.in);
        carList = new ArrayList<>();

        inputCarNumber(input);

        /** 차량의 이름을 입력받아 각 차량 객체를 만들어서 carList에 저장함 */
        while (carList.size() < carNumber) {
            inputCarName(input);
        }

        nextFiveTimeStep();

        printWinner(getMaxPosition());

    }

    /**
     * 5 개의 타임 스탭을 진행하는 메서드
     */
    private void nextFiveTimeStep() {
        for (int i = 0; i < MAX_TIMESTEP; i++) {
            System.out.println((i + 1) + "time");
            playOneTime();
        }
    }

    /**
     * 차량 갯수를 입력하는 메서드
     * @param input
     */
    private void inputCarNumber(Scanner input) {
        while (carNumber < LIMIT_CARNUMBER) {
            System.out.println("차량의 갯수를 입력하세요: ");
            carNumber = input.nextInt();
            carNumberErrorMessage();
        }
    }

    /**
     * carNumber가 입력받은 값이 2미만이면 오류메세지를 출력한다.
     */
    private void carNumberErrorMessage() {
        if (carNumber < 0) {
            System.out.println("양의 정수를 입력해주세요!");
            return;
        }

        if (carNumber < LIMIT_CARNUMBER) {
            System.out.println("2이상의 수를 입력해주세요!");
        }
    }

    /**
     * Car 객체의 생성자를 입력받아 생성하는 메서드
     * @param sc
     */
    private void inputCarName(Scanner sc) {
        System.out.println("차량이름을 입력하세요: ");
        String carName = sc.next();
        carList.add(new Car(carName));
    }

    /**
     * 1 step 타임 실행하는 메서드
     */
    private void playOneTime() {
        for (Car car : carList) {
            car.play();
            car.printCurrentPosition();
        }
    }

    /**
     * 가장 멀리간 차의 위치를 찾는 메서드
     * @return
     */
    private int getMaxPosition() {
        return carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();
    }

    /**
     * 우승한 차량을 출력해주는 메서드
     * @param maxPosition
     */
    private void printWinner(int maxPosition) {
        System.out.print("우승한 차량: ");
        carList.stream()
                .filter(n -> n.getPosition() == maxPosition)
                .map(Car::getName)
                .forEach(n -> System.out.print(n + " "));
    }

}