package utils;

public class InputTryNumberException extends RuntimeException {

    public InputTryNumberException() {
    }

    public InputTryNumberException(String message) {
        System.out.println(message);
    }
}
