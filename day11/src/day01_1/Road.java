package day01_1;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("��Ƽ��","Ȳ�ݻ�",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",35000,"Daily");
		
		// up
		Car noOptionFerrari = new SuperCar("ferrari","Red",35000,"Daily");
		noOptionFerrari.engineStart();
		
		// down
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
	}
}
