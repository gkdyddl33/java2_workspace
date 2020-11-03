package day01;

public class Road {
	public static void main(String[] args) {
		Car metiz = new Car("마티즈","황금색",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",35000,"Daily");
		
		// up casting
		Car noOptionFerrari = new SuperCar("ferrari","Red",35000,"Daily");
		noOptionFerrari.engineStart();
		noOptionFerrari.engineStop();
		
		// down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
	}
}
