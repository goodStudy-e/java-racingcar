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
    private static int carNumber;
    private ArrayList<Car> carList;

    public void playRacingGame() {

        Scanner sc = new Scanner(System.in);

        System.out.println("차량의 갯수를 입력하세요: ");
        carNumber = sc.nextInt();
        carList = new ArrayList<>();

        /** 차량의 이름을 입력받아 각 차량 객체를 만들어서 carList에 저장함 */
        while (carList.size() < carNumber) {
            System.out.println("차량이름을 입력하세요: ");
            String carName = sc.next();
            carList.add(new Car(carName));
        }

        /** 5 개의 타임 스탭 후 레이스는 끝남. */
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + " 타임 진행");
            for(int j = 0; j < carList.size(); j++) {
                carList.get(j).play();
                carList.get(j).printCurrentPosition();
            }
        }

        /** 차중에서 가장 멀리간 차의 위치 */
        int maxPosition = carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();

        System.out.print("우승한 차량: ");

        carList.stream()
                .filter(n -> n.getPosition() == maxPosition)
                .map(Car::getName)
                .forEach(n -> System.out.print(n + " "));

    }

}
