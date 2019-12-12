package domain;

import java.util.Random;

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
	
	private static final int MAX_RANGE = 10;
	private static final int MIN_POSITION = 0;
	
    private final String name;
    private int position = 0;
    
    
    public Car(String name) {
        this.name = name.trim();
        this.position = move();
    }
    
    private int randomRange() {
    	return new Random().nextInt(MAX_RANGE); 
    }
    
    private boolean increase() {
    	return randomRange() > 4;
    }
    
    private int move() {
    	return (increase() ? position+=1 : MIN_POSITION);
    			
    }
    
   
    
    public String getName() {
		return name;
	}
    
    public int getPosition() {
		return position;
	}
    
    @Override
    	public String toString() {
    	 return name;
    	}
}
