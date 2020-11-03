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
		
		// append -> 문자가 이어져서 작성된다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
//		bw.write("사랑행복");
//		bw.write("\n행복\n");
//		bw.close();
		
		// (1)전체목록 가져오기
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
//			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
//		}
		
		// (2)수정 -> 새로운 값을 연결
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
				if(line.equals("행복")) {
					result += "사랑\n"; // 해당 코드가 없고, 바로 continue로
					continue;			// 가면은 해당 라인이 없어지면서
										// 다음으로 넘어간다 -> 삭제
				}
				result += line + "\n";
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write(result);
		bw.close();
		
	}
}
