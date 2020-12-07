package week1five;

class Hobby{ // 멤버변수 > 생성자 > 메소드로 구성
	// 멤버변수
	String name;
	String type;
	//생성자
	Hobby(){
		
	}
	
	Hobby(String name, String type){
		this.name = name;
		this.type = type;
	}
	//메소드 구성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

class Person{
	private String name;
	private String gender;
	private Hobby b;
	
	public Person() {
		
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Hobby getB() {
		return b;
	}
	public void setB(Hobby b) {
		this.b = b;
	}
	public void eat() {
		System.out.println("식사합시다");
	}
	public void hello() {
		System.out.println("안녕하세요");
	}
	
}
class Student extends Person{
	public Student() {
	}
	public Student(String name, String gerdr) {
			super(name,gerdr);
			//super.setName(name);
			//super.setGender(gender);
	}
	// hello 재정의
	public void hello() {
		System.out.println("안녕하세요 취미가 "+super.getB().getName()+"인"+super.getName()+"입니다.");
	}
}
/*
Person p = new Student(“김학생”, “남”);
Hobby h = new Hobby(“농구”, “구기”);
p.setHobby(h);
p.eat(); // Person class의 eat()호출, “식사를 합니다”
p.hello(); // Student class의 hello()호출, “안녕하세요 취미가 농구인 김학생입니다”
 * */
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Student("김학생","남");
		Hobby h = new Hobby("농구", "구기");
		p.setB(h);
		p.eat();
		p.hello();
	}
}
