package week1one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class If {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int firstsu =0, secondsu = 0;

		System.out.println("첫번째 수 = ");
		firstsu = Integer.parseInt(in.readLine());
		
		System.out.println("두번째 수 =");
		secondsu = Integer.parseInt(in.readLine());
		
		if(firstsu > secondsu) {
			System.out.println("첫번째 수("+firstsu +")");
			System.out.println("가 두번째 수("+secondsu+")");
			System.out.println("보다 큰 수 입니다.");
		}else {
			System.out.println("첫번째 수("+firstsu+")");
			System.out.println("가 두번째 수 ("+secondsu+")");
			System.out.println("보다 작은 수 입니다.");
		}
	}
}
