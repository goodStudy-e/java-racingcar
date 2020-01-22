package domain;

public class CarNameLengthException extends RuntimeException{

    private String message = "이름은 5글자 이하로 작성하여 주십시오.";

    public CarNameLengthException(String wrongNames){
    }
    public CarNameLengthException(){
    }

    public String getMessage(){
        return message;
    }
}
