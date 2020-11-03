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
		System.out.println(songName+"곡을 재생합니다.");
		
	}
	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
		
	}
	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
		
	}
}
