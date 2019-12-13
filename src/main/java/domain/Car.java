/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */
package domain;

/**
 * 클래스 이름: Car.java
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.13 (금)
 * @version 1.0.0
 */
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    /**
     * 자동차의 현재위치를 가져온다.
     * @return
     */
    public int getPosition() {
        return position;
    }

    /**
     * 해당 차량이 한 타임 스탭을 지난다.
     */
    public void play() {
        /** (0 ~ 0.5미만): 0, (0.5 ~ 1.0미만): 1 랜덤으로 진행*/
        position += (int) Math.round(Math.random());
    }

    /**
     * 해당 차량의 현재 위치를 출력하는 기능
     */
    public void printCurrentPosition() {
        for (int i = 0; i < position; i++)
            System.out.print("-");
        System.out.println();
    }

    /**
     * 해당 차량의 이름을 가져온다.
     * @return
     */
    public String getName() {
        return name;
    }
}

