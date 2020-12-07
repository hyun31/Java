package example;

import java.util.Scanner;

/*
 * if문 예제 
 * 키보드를 입력받아 등급을 출력하시오.
 * 90~100 = A
 * 80~89 = B
 * 70~79 = C
 * 60~69 = D
 * 50~59 = E
 * 50이하 = F
 * */

public class Iftest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = scanner.nextInt();
		String grade ="";
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else if(score >= 50) {
			grade = "E";
		}else {
			grade = "F";
		}
		System.out.println("당신의 등급은: " + grade);
	}
}