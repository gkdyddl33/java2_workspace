package day11;

public class Encryption {
	public static void main(String[] args) {
		String pw = "a1b2c3";
		String en_pw = "";
		String de_pw = "";

		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char) (pw.charAt(i) * 3);
		}

		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char) (en_pw.charAt(i) / 3);
		}
		System.out.printf("��й�ȣ:%s\n", pw);
		System.out.printf("��ȣȭ:%s\n", en_pw);
		System.out.printf("��ȣȭ:%s", de_pw);
	}
}
