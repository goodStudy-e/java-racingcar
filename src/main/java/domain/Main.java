package domain;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArray;

//      예외처리 : 중복된 이름, 자동차 2개이상 아닐 때
        while (true) {
            System.out.println("자동차이름을 입력합니다. (이름은 쉼표(,)로 구분);");
            String names = scanner.nextLine();
            nameArray = names.split(",");
            Set nameSet = new HashSet(Arrays.asList(nameArray));
            if (nameArray.length != nameSet.size()) {
                System.out.println("중복된 이름이 있습니다. 다시 입력해 주세요.");
                continue;
            }
            if (nameArray.length < 2) {
                System.out.println("2대 이상 되어야 경주를 할 수 있습니다. 다시 입력해 주세요.");
                continue;
            }
            break;
        }

        // 예외처리 : 숫자가 아닐때, 0보다 큰수가 아닐때
        int runCount;
        while (true) {
            System.out.println("횟수를 입력합니다.");
            try {
                runCount = Integer.parseInt(scanner.nextLine());
                if (runCount < 1) {
                    System.out.println("0보다 큰 수를 입력하여 주세요");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하여 주세요");
                continue;
            }
            break;
        }

        System.out.println("경주를 시작합니다.");
        Timer timer = new Timer();
        timer.schedule(new Race(nameArray, runCount),0,1000);

    }
}
