package domain;

import java.util.Scanner;
/**
 * @ClassName InputCar
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
public class InputCar {

	static final Scanner SCANNER = new Scanner(System.in);
	private static int COUNT = 3;
	private String carNames;
	
	public InputCar() {
	 this.carNames = setName();
	 System.out.println("현재 차 이름 : "+this.carNames);
	}
	
	private String setName() {
		String name = "";
		for (int i = 0; i < COUNT-1; i++) {
			name+=(SCANNER.next()+",");
		}
		name += SCANNER.next();
		return name;
	}
	
	public String[] toArray() {
		return carNames.split(",");
	}
	
} 
