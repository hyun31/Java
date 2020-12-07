package week1one;


public class InnerEx1 {
	int m = 0;
	class Instancelnner{
		int iv = 100;
		int t = m;
//		static int cv = 100; // 에러! static 변수 선언 불가
		final static int CONST = 100; // final static는 상수라 가능
	}
	static class StaticInner{
		int iv = 200;
		//int t = m; // Error발생
		static int cv = 200; //static클래스만 static멤버를 정의 
	}
	void myMethod(){
		class Locallnner{
			int iv = 300;
			int t = m; // Outer의 멤버변수 접근가능
			//static int cv = 300; // 에러! static 변수 선언 불가
			final static int CONST = 300; // final static는 상수라 가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Instancelnner.CONST);
		System.out.println(StaticInner.cv);
	}
}

