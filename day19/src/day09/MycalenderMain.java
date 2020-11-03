package day09;

import java.util.Scanner;

public class MycalenderMain {
	protected int a;
	public int b;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mycalender mc = new Mycalender();
		
		System.out.print("년도:");
		int year = sc.nextInt();
		mc.setYear(year);
		
		System.out.print("월:");
		int month = sc.nextInt();
		mc.setMonth(month);
		
		System.out.print("일:");
		int date = sc.nextInt();
		mc.setDate(date);
		
		mc.printDate();
		System.out.println("오늘의 월:"+mc.getMonth());
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
		System.out.println("저장한 날짜는~");
		System.out.println(year+"년"+month+"월"+date+"일");
	}
	
}
