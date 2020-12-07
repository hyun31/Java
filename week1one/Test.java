package week1one;

import java.util.Scanner;
//실습: 국어, 영어, 수학 점수 받아서 총점, 평균 출력하기

//평균이 90초과 100이하 이면 A
//80초과 90이하 이면 B
//70초과 80이하이면 C
//60초과 70이하이면 D
//60이하면  E
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어=");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.println("영어=");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.println("수학=");
		int math = Integer.parseInt(scanner.nextLine());
		
		int tot = kor+eng+math;
		float avg = tot/3f;
		
		System.out.printf("총점: %d점%n",tot);
		System.out.printf("평균: %.2f점%n", avg);
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >=80){System.out.println("B");}
		 else if(avg >=70){System.out.println("C");}
		 else if(avg >=60){System.out.println("D");}
		 else {System.out.println("E");}
	}
}

