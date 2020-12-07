package week1two;

class SpecialMember extends GenerlMember2{ // GenerlMember2 상속 받음
	private int bonusPoint;

	public int getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(int bonusPoint) {this.bonusPoint = bonusPoint;}
	
	void printBonusPoint() {
		System.out.println("보너스 포인트:"+bonusPoint);
	}
}

class GenerlMember2 {
	private int memberNo;
	private String name;
	private String address;
	private Video2 rentaVideo;
	
	void setMemberData(int mno, String n, String a, Video2 rv) {
		memberNo = mno;
		name = n;
		address = a;
		rentaVideo = rv;
	}
		
	void printMemberData() {
		System.out.println("회원번호:"+memberNo);
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("대여중인 비디오 번호:"+rentaVideo.getVideoNo());
		System.out.println("대여중인 비디오 제목:"+rentaVideo.getTitle());
		System.out.println("대여중인 비디오 배우:"+rentaVideo.getActor());
	}
}

