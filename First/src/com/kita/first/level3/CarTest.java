package com.kita.first.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("소나타","흰색",2500);
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80","검은색");
		Car car4 = new Car(3500);
//		car.name = "소나타";
//		car.color = "흰색";
		car= car1;
		//car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		
	}
}
