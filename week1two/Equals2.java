package week1two;

class Person2{
	long id;
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person2) {
			return id ==((Person2)obj).id; // 멤버변수 값이 같이 같은지 비교
		}else {
			return false;
		}
	}
	Person2(long id){
		this.id = id;
	}
}

public class Equals2 {
	public static void main(String[] args) {
		Person2 p1 = new Person2(8011081111222L);
		Person2 p2 = new Person2(8011081111222L);
		
		if(p1 == p2)  // 다르다 
			System.out.println("p1과 p2는 같은 사람입니다.");
		else 
			System.out.println("p1과 p2는 다른 사람입니다.");
		
		if(p1.equals(p2)) // 같다. 재정의되어 같다고 표시함
			System.out.println("p1과 p2는 같은 사람입니다.");
		else 
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}
