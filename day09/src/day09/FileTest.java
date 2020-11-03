package day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
//		} catch (Exception e) {	;}
		
		// append -> ���ڰ� �̾����� �ۼ��ȴ�.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
//		bw.write("����ູ");
//		bw.write("\n�ູ\n");
//		bw.close();
		
		// (1)��ü��� ��������
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("test.text"));
//			String line = "";
//			while(true) {
//				line = br.readLine();
//				if(line==null) {
//					break;
//				}
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
//		}
		
		// (2)���� -> ���ο� ���� ����
		BufferedReader br = null;
		String result = "";
		
		try {
			br = new BufferedReader(new FileReader("test.txt"));
			String line = "";
			while(true) {
				line = br.readLine();
				if(line==null) {
					break;
				}
				if(line.equals("�ູ")) {
					result += "���\n"; // �ش� �ڵ尡 ����, �ٷ� continue��
					continue;			// ������ �ش� ������ �������鼭
										// �������� �Ѿ�� -> ����
				}
				result += line + "\n";
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write(result);
		bw.close();
		
	}
}
