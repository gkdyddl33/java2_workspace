package finaltest;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("��Ƽ��","Ȳ�ݻ�",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",350000,"Daily");
		
		Car noOptionFerrari = new SuperCar("ferrari","Red",350000,"Daily");
//		noOptionFerrari.engineStart();
		
//		SuperCar brokeCar = (SuperCar)new Car();
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
	}
}
