package day01;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("��Ƽ��","Ȳ�ݻ�",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",350000,"Daily");
		
		Car noOptionFerrari = new SuperCar("ferrari","Red",350000,"Daily");
//		noOptionFerrari.enginStart();
		
		//����ȯ
//		SuperCar brokenCar = (SuperCar) new Car();
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
//		fullOptionFerrari.openRoof();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		
	}
}
