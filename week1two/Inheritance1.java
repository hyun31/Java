package week1two;

class A{
	private int x = 100;
	private int y = 200;
}

class B extends A{
	private int r = 300;
}

public class Inheritance1 {
	public static void main(String[] args) {
		B bp = new B();
		// 아무런 멤버에 접근 할 수 없다.
	}
}
