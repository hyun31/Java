package week1one;

public class Chapter1 {
	public static void main(String[] args) {
		Chapter1 test = new Chapter1();
		int iValue = 1;
		System.out.println("test01 before:"+iValue); // 1
		test.test01(iValue);
		//call by reference로 파라미터를 넘기는 언어에서는 2로 값이 변경된다.
		System.out.println("test01 after.:"+iValue); // 1 파라미터 만 2라서 1 출력
		
		
		Box box = new Box(); // 새로운 객체 생성 
		System.out.println("test02 before.:"+box.x); // 0
		test.test02(box);
		System.out.println("test02 before.:"+box.x); // 0
		
		Box box2 = new Box(); // 객체 변수의 변수에 초기화
		System.out.println("test03 before:"+box2.x); // 0
		test.test03(box2);
		System.out.println("test03 before:"+box2.x); // 1
	}
	void test01(int param) {
		param = 2;
	}
	void test02(Box box) {
		box = new Box();
		box.x = 1;
	}
	void test03(Box box) {
		box.x =1;
	}
}
class Box{
	public int x;
}