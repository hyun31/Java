package week1one;

public class Operator3 {
	public static void main(String[] args) {
		//논리연산자: &&, || 앞쪽항만으로 결과가 결정되면 뒤쪽항을 실행하지 않는다.
		int x = 15;
		System.out.println(10 > x && x++ <20);
		System.out.println("x="+x);
		System.out.println(10 < x || x++ <20);
		System.out.println("x=+x");
		
		System.out.println(10 > x & x++ < 20);
		System.out.println("x="+x);
		System.out.println(10 < x | x++ < 20);
		System.out.println("x="+x);
		
		
		//조건연산자: 조건식 ? 식1 : 식 2
		int y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >=0 ? x: -x; // x의 값이 음수이면, 양수로 만든다.
		absY = y >=0 ? y: -y;
		absZ = z >=0 ? z: -z;
	}
}
