package day0102;

public class Abstract extends AbstractClass{
	public static void main(String[] args) {
		Abstract abs = new Abstract();
		abs.play("Joakim Karud - Mighty Love");
		abs.pause();
		abs.stop();
	}
	@Override
	void play(String songName) {
		System.out.println(songName+"���� ����մϴ�.");
		
	}
	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�.");
		
	}
	@Override
	void stop() {
		System.out.println("���� �����մϴ�.");
		
	}
}
