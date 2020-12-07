package week1one;

public class Incrementoperator {
	public static void main(String[] args) {
		// 증감연산자
		int i=5, j=5;;
		System.out.println(i++); // 사용후 증감
		System.out.println(++j); // 사용전 증감
		System.out.println("i= "+i+" , j="+j); 
		
		// 부호 연산자
		i= -10;
		i= +i;
		System.out.println(i);
		 
		i= 10;
		i= -1;
		System.out.println(i);
		
		// 나머지 연산자
		int x = 10;
		int y = 8;
		System.out.printf("%d을 %d로 나누면,\n",x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n",x/y, x%y);
	}
}
