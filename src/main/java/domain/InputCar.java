package domain;

import java.util.Scanner;
/**
 * @ClassName InputCar
 * 
 * @Version 2.0.0
 * 
 * @Date 20191212
 * 
 * @author asqwklop12
 * 
 * @email asqwklop12@gmail.com
 *
 */
public class InputCar {

	static final Scanner SCANNER = new Scanner(System.in);
	private String carNames;
	
	public InputCar() {
	 System.out.print("차이름을 입력해주세요: ");
	 this.carNames = SCANNER.next();
	 System.out.println("전체 차 명 : "+this.carNames);
	}
	
	public String[] toArray() {
		return carNames.split(",");
	}
	
	public Car[] generate(String[] cars) {
		int count = cars.length;
		Car[] car = new Car[count]; 
		for (int i = 0; i < cars.length; i++) {
			car[i] = new Car(cars[i]);
		}
		
		return car;
	}
	 
} 
