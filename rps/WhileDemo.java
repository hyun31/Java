package rps;

import java.util.Scanner;

public class WhileDemo{
	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("메뉴선택 0.종료 1.게임시작");
		switch(scanner.nextInt()) {
		case 0 : System.out.println("종료");return;
		case 1 : System.out.println("게임 중..");break;
			}
		}	
	}	
}