package day01_2;

public class Main extends Abstract{
	public static void main(String[] args) {
		Main main = new Main();
		main.play("Joakim Karud - Mighty Love");
		main.pause();
		main.stop();
	}
	@Override
	void play(String songName) {
		System.out.println(songName + "���� ����մϴ�.");		
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
