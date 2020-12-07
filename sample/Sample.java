package sample;

public class Sample {
	private String userid, password, name;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return this.userid;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String toShow(){
		return "[아이디: "+userid+", 비밀번호: "+password+", 이름: "+name+" ]";
	}
}
