package fianltest;

public class Tv {
//	 1. �޼ҵ���� �����Ѵ�.
//	 2. �Ű������� �����Ѵ�.
//	 3. ������ ������ �����Ѵ�.
//	 4. ���� ���� �����Ѵ�.
//	 5. ���� Ÿ���� �����Ѵ�.
	
	public void checkAni(Video[] videos) {
		for (int i = 0; i < videos.length; i++) {
			System.out.print(videos[i]);
			if(videos[i] instanceof AnimationMarker) {
				System.out.println("��(��) �ִϸ��̼� �Դϴ�.");
			}
			else {
				System.out.println("��(��) �ִϸ��̼��� �ƴմϴ�.");
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
