package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void positionUp(int upPosition) {
        position += upPosition;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
