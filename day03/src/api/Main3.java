package api;

import java.util.Random;
import java.util.Scanner;
import java.util.Arraylist;

public class Main3 {
	// 1���� N���� ������ ������ ��ȯ�ϵ��� �ֻ��� Ŭ������ �ϼ��ϰ�,
	// �ش� �ֻ����� 1000�� ���� ���� ����� ���Ͻÿ�.
	public static void main(String[] args) {
		// �Է°� �ޱ�
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
				
		// N��ü �ֻ��� ����
		Die d = new Die(N);
//		�ֻ����� ������ �� ���� ��� ���ؼ���?
//		System.out.println(d.roll());
		
	    // 1000�� �ֻ����� ���� ����� ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			int randNum = d.roll(); // ������ ���� ������
			numbers.add(randNum);
			System.out.println(randNum);
		}
		// ��հ� ���
		double avg = average(numbers);
		
		// ���
		System.out.println("avg: "+avg);
		
		// ��հ� ��ȯ
		public static double average(Arraylist<Integer> list) {
			double sum = 0;
			for(Integer n : list) {
				sum += n;
			}
			return sum/list.size();
		}
	}
}
class Die{
	private int maxNumber; // �ֻ����� �ִ밪

	public Die(int maxNumber) {
		super();
		this.maxNumber = maxNumber;
	}
	public int roll() {
		// 1~N(maxNumber)
		Random rand =  new Random();
		return 1 + rand.nextInt(maxNumber); // 1+(rand.nextInt) : 0,1,2,3,4,5 -> 1,2,3,4,5,6
	}
}
