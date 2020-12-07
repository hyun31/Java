package week1task;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import javafx.beans.property.SetProperty;

/* 제어문 실습 
선택하세요. [0:나가기, 1:학생입력, 2:학생수출력, 3:학과별 학점평균,4:학생목록출력]

[학생입력]
학번: 111
이름: 홍길동
학과: 수학과
학점: 90

[학과수 출력]
총학생수: 5
평균점수: 85

[학과별 학점평균]
학과를 입력하세요: 수학과
평균점수: 85

[학생목록출력]
학번: 111
이름: 홍길동
학과: 수학과
학점: 90
------------
학번: 112
이름: 김길동
학과: 국학과
학점: 85
* 선택 후 작업 수행하면 다시 ‘선택하세요’가 나타난다

* 학과: 수학과,국어과, 영어과
* */
class Student{
	int id; // 학번
	String name; // 이름
	String major; // 과목
	int pointer; // 점수
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getPointer() {
		return pointer;
	}
	public void setPointer(int pointer) {
		this.pointer = pointer;
	}
}

public class Control {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int cnt = 0;
		Student[] students = new Student[100];
		while(true) {
			System.out.println("메뉴 0.종료 1.학생입력 2.학과수 출력 3.학과별 평균 4.학생목록출력");
			Scanner scanner = new Scanner(System.in);
			
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); break;
			case 1 : System.out.println("학생정보");
					 Student student = new Student();
					 System.out.println("학번입력:");
				     student.setId(scanner.nextInt());
				     System.out.println("이름입력:");
					 student.setName(scanner.next());
					 System.out.println("과목입력:");
					 student.setMajor(scanner.next());
					 System.out.println("점수입력:");
					 student.setPointer(scanner.nextInt());
					 
					 students[cnt] = student;
					 cnt++;
					 break;
			case 2 : System.out.println("총 학생수:"+cnt);
					 System.out.println("평균점수:"+sum/(float)cnt);
					 break;
			case 3 : System.out.println("학과별 평균: 수학과|영어과|국어과");
				     String grade = scanner.next();
				     int cnt1 = 0;
				     for(int i=0; i<cnt; i++) {
				    	 if(students[i].getMajor().equals(grade)) {
				    		sum += students[i].getPointer();
				    		 cnt1++;
				    	 }
				     }
			 		 break;
			case 4 : System.out.println("학생목록 출력");
					for(int i=0; i<cnt; i++) {
						System.out.printf("학번: %d 이름: %s 과목: %s 점수: %d",students[i].getId(),students[i].getName(),students[i].getMajor(),students[i].getPointer());
						
					}
					 
					 
			}
		}
	}
}

