package week1two;



class Video2{
	private int videoNo;
	private String title;
	private String actor;
	
	public void setVideoNo(int videoNo) {this.videoNo = videoNo;}
	public int getVideoNo() {return videoNo;}
	public void setTitle(String title) {this.title = title;}
	public String getTitle() {return title;}
	public void setActor(String actor) {this.actor = actor;}
	public String getActor() {return actor;}
	
	void setViderData(int vno, String t, String a) {
		videoNo = vno;
		title = t;
		actor = a;
	}
	
}

public class VideoShop2 {
	public static void main(String[] args) {
		Video2 v = new Video2();
		v.setViderData(100, "뽀로로탐험대", "조뽀로");
		SpecialMember m = new SpecialMember();
		m.setMemberData(1,"허영석", "광진구 123번지", v);
		m.setBonusPoint(10);
		m.printMemberData();
		m.printBonusPoint();
	}
}
