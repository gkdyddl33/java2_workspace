package day01_2;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("마티즈","황금색",100);
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 35000, "Daily");
		
		Car noOptionFerrari = new SuperCar("Ferrari", "Red", 35000, "Daily");
		noOptionFerrari.enginStart();
		
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.openRoof();
	}
}
