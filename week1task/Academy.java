package week1task;

import java.util.Scanner;

/*
 /*
• 실습: 학원시스템
선택하세요. [0:나가기, 1:학생등록, 2:강사등록, 3. 관련자 조회, 4. 강의등록,5:강의조회]

[학생등록]
학생번호: 100
학생이름: 홍길동

[강사등록]
강사번호: 200
강사이름: 김강사

[관련자조회]
관련자유형(학생(10)/강사(20)): 10
관련자번호: 100

----------------------
학생: 100/홍길동

[강의등록]
강의번호: 001
강사번호(0:취소): 200
학생번호(0:취소, 1:등록완료): 100
학생번호(0:취소, 1:등록완료): 101
학생번호(0:취소, 1:등록완료): 102

[강의조회]
강의번호: 001
----------------------------
강사번호: 200
학생번호: 100/101/102

=============================================================

* 참조변수 복사 시 발생하는 문제는 무시한다

* 학생등록 시 중복체크
   ‘학생번호가 중복됩니다’

* 강사등록 시 중복체크
   ‘강사번호가 중복됩니다’

* 관련자 조회
  - 검색하려는관련자가 없으면
      ‘존재하지 않은 관련자입니다’

* 강의등록
  - 강사번호, 학생번호는 존재하는 번호를 등록할 때까지
      반복해서 입력요청한다

  - 학생번호는등록완료(1)시까지 반복해서 입력한다

  - 검색하려는강의번호가 없으면
      ‘존재하지 않은 강의번호입니다’
      
  - 하나의강의에 강사는 한명만

 * */
//학생
class Stue {
	public String name; // 이름

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int snumber; // 번호

	public int getNumber() {
		return snumber;
	}

	public void setNumber(int number) {
		this.snumber = number;
	}

}

//강사
class Teacher {
	// 강사이름
	public String teacher;

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTeacher() {
		return teacher;
	}

	// 강사번호
	public int tnumber;

	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}

	public int getTnumber() {
		return tnumber;
	}
}

public class Academy {
	private static final String Loop1 = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stue[] stuarr = new Stue[100]; // 학생
		Teacher[] teaarr = new Teacher[100]; // 강사
		int count = 0; // 학생인원 체크
		int cnt = 0; // 강사인원 체크
		while (true) {
			System.out.println("메뉴>> 0:나가기, 1:학생등록, 2:강사등록, 3. 관련자 조회, 4. 강의등록,5:강의조회");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("나가기");
				return;
			case 1:
				Stue stue = new Stue();
				System.out.println("학생등록 서버스 입니다.");
				System.out.println("학생이름을 입력하세요:");
				stue.setName(scanner.next());
				System.out.println("학생번호를 입력하세요:");
				stue.setNumber(scanner.nextInt());
				stuarr[count] = stue;
				count++;
				for (int i = 0; i < count - 1; i++) {
					if (stuarr[i].getNumber() == stue.getNumber()) {
						System.out.println("중복된 학생번호 입니다.");
						break;
					}
				}
				break;
			case 2:
				Teacher teacher = new Teacher();
				System.out.println("강사등록 서비스 입니다.");
				System.out.println("강사이름을 입력하세요:");
				teacher.setTeacher(scanner.next());
				System.out.println("강사번호를 입력하세요:");
				teacher.setTnumber(scanner.nextInt());
				teaarr[cnt] = teacher;
				cnt++;
				for (int i = 0; i < cnt - 1; i++) {
					if (teaarr[i].getTnumber() == teacher.getTnumber()) {
						System.out.println("중복된 강사번호 입니다.");
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("관련자 조회 서비스 입니다.");
				System.out.println("관련자유형을 입력하세요 (학생(10)/강사(20):");
				System.out.println("관리자번호를 입력하세요:");
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}

	}
}

//// 학생
//if(Manager == 10)
//	for(int i=0; i<stuarr.length; i++) {
//		if(stuarr[i].getNumber() == Managern) {
//			System.out.printf("학생: %d / %s%n",stuarr[i].getNumber(),stuarr[i].getName());
//}
//}
//		// 강사
//		if(Manager == 20) 
//		 	for(int j=0; j<teaarr.length; j++) {
//				if(teaarr[j].getTnumber() == Managern) {
//					System.out.printf("강사: %d / %s%n",teaarr[j].getTnumber(),teaarr[j].getTeacher());
//					break;
//			}		
//		}
//		else {
//			System.out.println("에러");
//
