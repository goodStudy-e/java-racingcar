/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */

package domain;

/**
 * 클래스 이름: Main.java
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.13 (금)
 * @version 1.0.0
 */
public class Main {

    /**
     * 레이싱 게임을 시작하는 메인 메소드
     * @param args
     */
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.playRacingGame();
    }
}
