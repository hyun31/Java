package sequencetest;

import java.util.Scanner;
public class StudentApp{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student[] arr = new Student[2];
		for(int i=0; i<arr.length; i++) {
			Student student = new Student();
			System.out.println("이름: ");
			student.setName(scanner.next());
			System.out.println("국어점수: ");
			student.setKor(scanner.nextInt());
			System.out.println("영어점수: ");
			student.setEng(scanner.nextInt());
			System.out.println("수학점수: ");
			student.setMath(scanner.nextInt());
			student.sum();
			student.avg();
			System.out.println("평균: "+student.showAge());
			arr[i]=student;
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i].printStates();
		}
		
	}
	
			
	
}