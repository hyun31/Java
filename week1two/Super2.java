package week1two;

class Employee1{
	  Employee1(int a) { 
	  // 생략시 자동으로 기본형이 생성된다. Employee(){} ,java.lang.Object 생성
	     System.out.println("나는 부모 constuctor");
	  } 
	}
	class Manager1 extends Employee1{
	  Manager1() {
	      super(1); // 생략시자동으로 생성된다.     
	     System.out.println("나는 자식 constuctor");
	  }
	}

	public class Super2{
	  public static void main(String args[])  {
	     Manager m = new Manager();  // constuctor 라인 호출
	  }
	}
