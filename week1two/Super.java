package week1two;

class Employee{
	
	 Employee(){ 
		 System.out.println("나는 부모 constuctor"); 
	}
}	
class Manager extends Employee{
	Manager(){
		super();
		System.out.println("나는 자식 constuctor");
	}
}

public class Super {
	public static void main(String[] args) {
		Manager m = new Manager();
	}
}