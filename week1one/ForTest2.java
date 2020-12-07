package week1one;

public class ForTest2 {
	public static void main(String[] args) {
		Loop1 :
		for	(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
				//break Loop1; // 2단 4까지
				//break; // 4까지
				//continue Loop1; // 4까지 결과
				//continue; // 9까지결과 5제외
				System.out.println(i+ "*" +j +"="+ i*j);
			} // end of for i
			System.out.println();
		} // end of Loop1
	}
}
