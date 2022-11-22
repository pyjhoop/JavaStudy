package model.vo;

public class Class {
	
	// private 캡슐화 선언
	private String title;
	private String artist;
	
	
	// 생성자부
	public Music() {}

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	
	// get & set
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	// 총 출력문 toString
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
}
