package domain;

/**
 * @ClassName Car
 * 
 * @Version 1.0.0
 * 
 * @Date 20191210
 * 
 * @author asqwklop12
 * 
 * @email asqwklop12@gmail.com
 *
 */
public class Car {
    private final String name;
    private int position = 0;
    private int MAX_STEP = 3+1;
    
    public Car(String name) {
        this.name = name;
        this.position = randomStep();
    }

    private int randomStep() {
    	return (int)(Math.random() * MAX_STEP);
    }
}
