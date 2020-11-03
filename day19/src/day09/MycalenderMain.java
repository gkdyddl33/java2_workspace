package day09;

import java.util.Scanner;

public class MycalenderMain {
	protected int a;
	public int b;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mycalender mc = new Mycalender();
		
		System.out.print("�⵵:");
		int year = sc.nextInt();
		mc.setYear(year);
		
		System.out.print("��:");
		int month = sc.nextInt();
		mc.setMonth(month);
		
		System.out.print("��:");
		int date = sc.nextInt();
		mc.setDate(date);
		
		mc.printDate();
		System.out.println("������ ��:"+mc.getMonth());
	}
}
class Mycalender{
	private int year;
	private int month;
	private int date;
	
	public Mycalender() {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>0) {
			this.year = year;
		}
		else {
			this.year = 2020;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(1<=month && month<=12)
		{
			this.month = month;
		}
		else
		{
			this.month = 1;
		}
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		if(1<=date&&date<=31) {
			this.date = date;
		}
		else {
			this.date=1;
		}
	}
	
	void printDate() {
		System.out.println("������ ��¥��~");
		System.out.println(year+"��"+month+"��"+date+"��");
	}
	
}
