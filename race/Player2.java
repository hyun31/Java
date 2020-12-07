package race;

public class Player2 {
	private String name;
	private int recode2;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setRecode2(int recode2) {
		this.recode2 = recode2;
	}
	public int getRecode2() {
		return this.recode2;
	}
	void showPlayer2(){
		System.out.println("이름:"+ name +",기록:"+ recode2 +"초:");
	}
}
