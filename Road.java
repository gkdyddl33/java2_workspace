package day01;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("��Ƽ��","Ȳ�ݻ�",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",35000,"Daily"); // �߰��ʵ��� �ڽ�Ŭ����
		
		// up casting
		Car noOptionFerrari = new SuperCar("ferrari","Red",35000,"Daily");
//		noOptionFerrari.engineStart();
		
		//���� -> ����ȯ ����
		//SuperCar brokeCar = (SuperCar)new Car();
		
		// down casting -> �θ� Ÿ�Կ��� �ڽ����� ����ȯ������� ��밡��
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
//		fullOptionFerrari.openRoof();
		
		//matiz
		//ferrari
		//noOptionFerrari = up casting
		//fullOptionFerrarl = down casting
		
		System.out.println(matiz instanceof Car); // ��
		System.out.println(matiz instanceof SuperCar); // ����
		System.out.println(ferrari instanceof Car); // ��
		System.out.println(ferrari instanceof SuperCar); // ��
		System.out.println(noOptionFerrari instanceof Car); // �� -> supercar �ε� "��"
		System.out.println(noOptionFerrari instanceof SuperCar); // ��
		System.out.println(fullOptionFerrari instanceof Car); // ����x -> ��
		System.out.println(fullOptionFerrari instanceof SuperCar); // ����x -> ��
	}
}
