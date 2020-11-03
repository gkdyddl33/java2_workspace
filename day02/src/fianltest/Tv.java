package fianltest;

public class Tv {
//	 1. 메소드명을 생각한다.
//	 2. 매개변수를 생각한다.
//	 3. 실행할 문장을 생각한다.
//	 4. 리턴 값을 생각한다.
//	 5. 리턴 타입을 결정한다.
	
	public void checkAni(Video[] videos) {
		for (int i = 0; i < videos.length; i++) {
			System.out.print(videos[i]);
			if(videos[i] instanceof AnimationMarker) {
				System.out.println("은(는) 애니메이션 입니다.");
			}
			else {
				System.out.println("은(는) 애니메이션이 아닙니다.");
			}
		}
	}
	public static void main(String[] args) {
		Video[] videos = {
				new Zzangu(),
				new OnePiece(),
				new HarryPotter(),
				new Ddolbie(),
		}; 
		new Tv().checkAni(videos);
	}
}
