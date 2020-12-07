package week1four;

class Employee{
	String name;
	int age;
	String title;
	String dept;
	
	public Employee(String name, int age, String title, String dept) {
		this.name = name;
		this.age = age;
		this.title = title;
		this.dept = dept;
	}
	public String toString() { // obj메소드 재정의
		return "일반사원 " +this.name+ "입니다";
	}
}

class Msuper extends Employee{ // 상속
	int titlePay;
	
	public Msuper(String name, int age, String title, String dept, int titlePay) {
		super(name, age, title, dept);
		this.titlePay = titlePay;
	}
	public String toString() { // obj메소드 재정의
		return "매니저" + super.name + "입니다";
	}
}

public class Super {
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		Employee e = new Employee("홍길동", 29, "대리", "인사팀"); // name age title dept
		Employee e2 = new Msuper("홍팀장", 35, "팀장", "인사팀", 200000); // name age title dept titlPay
		
	    emps[0] = e;
	    emps[1] = e2;
	    for(Employee i : emps) {
	    	System.out.println(i); // toString 생략해도 호출이 가능, 
	    	//System.out.println(i.toString()); 
	    }
	}
}
