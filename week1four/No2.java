package week1four;
import java.util.Arrays;

class Noo{
	String name;
	int age;
	private final int hobbysSize =10;
	String[] hobbys = new String[hobbysSize];
	
	Noo(){
		
	}
	Noo(Noo n){
		this(n.name, n.age, n.hobbys);
	}
	Noo(String name, int age, String[] hobby){
		this.name = name;
		this.age = age;
		int lenght = hobbysSize;
		if(hobbysSize > hobby.length) lenght = hobby.length;
		for(int i=0; i< lenght; i++) {
			this.hobbys[i] = hobby[i];
		}
	}
	public String toString() {
		return "name:" + this.name + ", age:" +
		this.age + ", hobby:" +
		Arrays.toString(this.hobbys);
	}
}
public class No2 {
	public static void main(String[] args) {
		String[] hobbys = {"자전거", "등산"};
		Noo no1 = new Noo("홍길동", 30, hobbys);
		System.out.println(hobbys == no1.hobbys); // flase
		
		Noo no2 = new Noo(no1);
		
		System.out.println("no1+no1");
		System.out.println("no2+no2");
		
		hobbys[0] = "오토바이";
		System.out.println("no1:"+no1);
		System.out.println("no2:"+no2);
	}
}
