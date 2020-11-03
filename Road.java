package day01;

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car("마티즈","황금색",100);
		SuperCar ferrari = new SuperCar("ferrari","Red",35000,"Daily"); // 추가필드사용 자식클래스
		
		// up casting
		Car noOptionFerrari = new SuperCar("ferrari","Red",35000,"Daily");
//		noOptionFerrari.engineStart();
		
		//오류 -> 형변환 오류
		//SuperCar brokeCar = (SuperCar)new Car();
		
		// down casting -> 부모 타입에서 자식으로 형변환해줘야하 사용가능
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
//		fullOptionFerrari.openRoof();
		
		//matiz
		//ferrari
		//noOptionFerrari = up casting
		//fullOptionFerrarl = down casting
		
		System.out.println(matiz instanceof Car); // 참
		System.out.println(matiz instanceof SuperCar); // 거짓
		System.out.println(ferrari instanceof Car); // 참
		System.out.println(ferrari instanceof SuperCar); // 참
		System.out.println(noOptionFerrari instanceof Car); // 참 -> supercar 로도 "참"
		System.out.println(noOptionFerrari instanceof SuperCar); // 참
		System.out.println(fullOptionFerrari instanceof Car); // 거짓x -> 참
		System.out.println(fullOptionFerrari instanceof SuperCar); // 거짓x -> 참
	}
}
