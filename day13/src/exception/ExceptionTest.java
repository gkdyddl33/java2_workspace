package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			System.out.println(e);
		}finally {
			System.out.println("반드시 실행할 문장");
		}
	}
}
