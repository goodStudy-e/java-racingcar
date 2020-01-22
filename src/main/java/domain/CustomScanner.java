package domain;

import java.util.Scanner;

public class CustomScanner {

    private static Scanner scanner = new Scanner(System.in);

    public String getResponse(String request) {
        System.out.println(request);
        String response = scanner.nextLine();
        return response;
    }
}
