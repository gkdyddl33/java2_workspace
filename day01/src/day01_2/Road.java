package day01_2;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("��Ƽ��","Ȳ�ݻ�",100);
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 35000, "Daily");
		
		Car noOptionFerrari = new SuperCar("Ferrari", "Red", 35000, "Daily");
		noOptionFerrari.enginStart();
		
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.openRoof();
	}
}
