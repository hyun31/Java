package week1four;

import java.util.Arrays;

class No{
	String name;
	int age;
	String[] honnys;
	
	No(){
		
	}
	No(No n){
		this(n.name, n.age, n.honnys);
	}
	No(String name, int age, String[] hobby){
		this.name = name;
		this.age = age;
		//this.hobbys = hobby.clone();
		this.honnys = hobby;
	}
	public String toString() {
		return "name:" + this.name +", age:" + this.age + 
			   ", hobby:"+Arrays.deepToString(this.honnys);
	}
}
public class No1 {
	public static void main(String[] args) {
		String[] hobbys = {"자전거","등산"};
		No n1 = new No("홍길동",30,hobbys); // No이라는 지역변수 생성
		System.out.println(hobbys == n1.honnys); //  조작이 가능
		
		No n2 = new No(n1);
		// No n3 = new No();
		
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		hobbys[0] = "오토바이"; // 값 변경 
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
	}
}
