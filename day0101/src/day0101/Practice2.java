package day0101;

import java.util.Arraylist;

public class Practice2 {
	// ���� ��ٱ���
	// ��ǰ��ü�� ��ٱ��Ͽ� ���, �̸� ��� ����Ͻÿ�.
	//			Goods		->extends, abstract class, concrete class
	//	Monitor TV Computer
	public static void main(String[] args) {
		// ��ǰ ��ü����
		Goods monitor = new Monitor("FHD ���̵� �����",450000);
		Goods tv = new TV("SK ������ TV",2350000);
		Goods computer = new Computer("��Ʈ�� �����",1650000);
		
		// ��ٱ��Ͽ� ���
		Arraylist <Goods> cart = new Arraylist <Goods>();
		cart.add(monitor);
		cart.add(tv);
		cart.add(computer);
		
		// ��ٱ��� ���� ���
		for(Goods g : cart) {
			System.err.println(g.toString());			
		}
	}
}
abstract class Goods{
	// �߻�Ŭ���� �ʵ�
	protected String name;
	protected int price;
	// �߻�Ŭ���� ������
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	// toString() �޼ҵ� �������̵�
	public String toStirng() {
		return String.format("%s:%d��", name,price);
	}
}
class Monitor extends Goods{
	public Monitor(String name,int price) {
		super(name,price);
	}
}
class TV extends Goods{
	public TV(String name,int price) {
		super(name,price);
	}
}
class Computer extends Goods{
	public Computer(String name,int price) {
		super(name,price);
	}
}