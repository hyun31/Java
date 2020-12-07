package test;

import java.util.Scanner;


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

	public class T {
		public static void main(String[] args) {
			int num = 0;
			int sum = 0;
			int cnt = 0;
			Student[] students = new Student[100];
			while(true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("메뉴 0.종료 1.학생입력 2.학과수 출력 3.학과별 평균 4.학생목록출력");
				
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
						 for(int i=0; i<cnt; i++) {
							 sum+= students[i].getPointer();
						 }
						 System.out.println("평균점수:"+sum/(float)cnt);
						 break;
				case 3 : System.out.println("학과별 평균: 수학과|영어과|국어과");
					     String grade = scanner.next();
					    // int sum1 = 0;
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
							System.out.printf("학번: %d%n 이름: %s%n 과목: %s%n 점수: %d%n",
									students[i].getId(),students[i].getName(),students[i].getMajor(),students[i].getPointer());
						 break;
						}
				case 5 : System.out.println("차량판매 입니다.");
						 
				}
			}
		}
	}
