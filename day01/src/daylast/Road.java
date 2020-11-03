package daylast;

public class Road {	
	public static void main(String[] args) {
		Car matiz = new Car("마티즈","황금색",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",35000,"Daily");
		
		Car noOptionFerrari = new SuperCar("ferrari","Red",35000,"Daily");
		noOptionFerrari.enginStart();
		
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
	}

}
