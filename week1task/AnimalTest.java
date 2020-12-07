package week1task;


public class AnimalTest {
	public static void main(String[] args) {
		Anima ani = new Anima();
		ani.setName("멍멍");
		ani.setAge(5);
		ani.setType("Dog");
		ani.bark(5);
		System.out.println(ani.toString());
		
		ani.count();
		Anima ani2 = new Anima(ani);
		if(ani.equals(ani)) {
			System.out.println("같은 강아지 입니다");
			Anima.count();
			System.out.println(Anima.count);
		}
	}

}
class Anima{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	int age;
	String type;
	static int count;
	
	public Anima() { //파라미터 생성자 없는 것 
		
	}
	public Anima(Anima ani) { //파라미터 생성자 있는 것
		this.name = ani.name;
		this.age = ani.age;
		this.type = ani.type;
	}
	
	public void bark(int cnt) {
		for(int i=0; i<cnt; i++) {
			if(type.equals("Dog")) {
				System.out.println("멍멍");
			}
			if(type.equals("cat")) {
				System.out.println("야옹");
			}
		}
	}
	public boolean equals(Object obj) { // 재 정의
		if(obj != null && obj instanceof Anima) {
			return this.type ==((Anima)obj).type && this.name == ((Anima)obj).name; 
		}else {
		}
		return false; 
	}
	public String toString() {
		return "나는 "+this.type +"이고 이름은 "+ this.name+ "이 입니다.";
	}
	public static int count () {
		return count++;
	}
}
	