package merber;

public class Member { // 정보은닉
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
	public String getPassword () {
		return this.password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "[아이디: "+userid+", 비번: "+password+",이름: "+name+"]";
	}
}
