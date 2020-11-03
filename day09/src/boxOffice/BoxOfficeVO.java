package boxOffice;

public class BoxOfficeVO {
	// 박스오피스 우선순위 위에 모델
	private int rank;
	private String film_name;
	private String release_date;
	private String income;
	private int dudience_cnt;
	private int screen_cnt;
	
	public BoxOfficeVO() {;}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getFilm_name() {
		return film_name;
	}

	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public int getDudience_cnt() {
		return dudience_cnt;
	}

	public void setDudience_cnt(int dudience_cnt) {
		this.dudience_cnt = dudience_cnt;
	}

	public int getScreen_cnt() {
		return screen_cnt;
	}

	public void setScreen_cnt(int screen_cnt) {
		this.screen_cnt = screen_cnt;
	}
	
}
