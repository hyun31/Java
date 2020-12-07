package week1task;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int exa = 200000; // 과장
		int hod = 500000; // 부장
		int tax0 = 20000; // 과장세금 10%
		int tax1 = 50000; // 부장세금 10%
		
		System.out.println("기본급을 입력하세요 :");
		int salary = scanner.nextInt();
		System.out.println("직책을 입력하세요 : ");
		String name = scanner.next();
		System.out.println("직책수당: ");
		int exa1 = scanner.nextInt();
		int sum = salary + exa - tax0;
		int sum1 = salary + hod - tax1;  
		
		while(true) {
			System.out.println("0.종료 1.과장 2.부장");
			switch(scanner.nextInt()){
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("실수령액: "+ sum); break;
			case 2 : System.out.println("실수령액: "+ sum1);break;
			}
		}
		
	}
}
