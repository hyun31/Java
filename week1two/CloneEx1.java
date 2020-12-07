package week1two;


class Point implements Cloneable{
	int x;
	int y;
	
	Point(int x, int y){
		this.x =x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x +", y="+y;
	}
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone(); // clone() 반드시는 예외 처리
		}catch (CloneNotSupportedException e) {}
			return obj;
	}
}

public class CloneEx1 {
	public static void main(String[] args) {
	Point orginal = new Point(3, 5);
	Point copy = (Point)orginal.clone();
	System.out.println(orginal);
	System.out.println(copy);
	}
}
