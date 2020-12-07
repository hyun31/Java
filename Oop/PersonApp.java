package Oop;

import java.util.Scanner;

import com.sun.javafx.fxml.BeanAdapter;

/*
 * RFP(제안 요청서)
 * Person(id, pass, name:String)
 * 	    - Student(ssn:String, score:int)
 * 		- Adim(rank:int)
 * <사용자기능> Student
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원 탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * 7. 점수 입력
 * ****************
 * <관리자기능> Admin
 * 1. 회원목록
 * 2. 아이디검색
 * 3. 이름검색
 * 4. 전체 회원수
 * 5. 성적별 현황(스코어 기준 이름 내림차순 예.. 1등 이순신(남) 98점, 2등 유관순(여) 85점)
 * */
class control{
	public static final String MAIN_MENU = "0.종료 1.학생 2.관리자" ;
	public static final String STUDENT_MENU = "1. 회원가입\n" + 
											  "2. 로그인\n" + 
											  "3. 비번수정\n"+ 
											  "4. 회원탈퇴\n" + 
											  "5. 아이디존재체크\n" +
											  "6. 마이페이지\n" + 
											  "7. 점수입력";
	
	public static final String ADMIN_MENU = "1. 회원목록\n" + 
											"2. 아이디검색\n" + 
											"3. 이름검색\n"+
											"4.전체회원수\n" + 
											"5.성적별 현황";
	
	public static final String PERSON_SPEC = "아이디: %s 비밀번호: %s 이름: %s ";
	public static final String STUDDENT_SPEC = "아이디: %s 비밀번호: %s 이름: (%s) 주민번호: (%s) %s 점수: %d";
	public static final String ADMIN_SPEC = "관리자아이디: %s 비밀번호: %s 이름: %s 등급: %d";
	}

class Person{
	protected String id, pass, name;

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@Override
	public String toString() {
		return String.format("아이디: %s 비밀번호: %s 이름: %s ",id, pass, name);
	}
}
class Student extends Person{
		private String ssn, gender; 
		private int score;
		
		public String getGender() {return gender;}
		public void setGender(String gender) {this.gender = gender;}
		
		public String getSsn() {return ssn;}
		public void setSsn(String ssn) {this.ssn = ssn;}
		
		public int getScore() {return score;}
		public void setScore(int score) {this.score = score;}
		
}
class Admin extends Person{
	private int rank;

	public int getRank() {return rank;}
	public void setRank(int rank) {this.rank = rank;}
	@Override
	public String toString() {
		return String.format("관리자 기능: %s 비밀번호: %s 이름: %s 등급: %d", id, pass, name, rank);
	}
}

interface PersonService{
	/**1. 회원가입 */
	public void join(Student student);
	/**2. 로그인 */
	public String loin(Student student);
	/**3. 비번수정*/
	public void changpass(Student student);
	/**4. 회원탈퇴*/
	public void remove(Student student);
	/**5. 아이디존재체크 */
	public String checkId(String id);
	/**6. 마이페이지 */
	public Student mypage(String id);
	/**7. 점수입력*/
	public void score(int[] arr);
	/**8. 회원목록 */
	public Student[] studentList();
	/**9. 아이디검색 */
	public Student idSearch(String id);
	/**10. 이름검색*/
	public Student[] searchname(String name);
	/**11.전체회원수 */
	public int studentCount();
	/**12.성적별 현황*/
	public Student[] gradeRank();
}

class PersonServiceImpl implements PersonService{
	private Student[] students;
	private int count;
	
	public PersonServiceImpl() {
		students = new Student[4];
		count = 0;
	}

	@Override
	public void join(Student student) {
		/**1. 회원가입 */
		students[count] = student;
		count++;
	}

	@Override
	public String loin(Student student) {
		/**2. 로그인 */
		String result = "로그인 실패";
		for(int i=0; i<count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPass().equals(students[i].getPass())) {
			}
		}
		return result;
	}

	@Override
	public void changpass(Student student) {
		/**3. 비번수정 */
		for(int i=0; i<count; i++) {
			if(student.getPass().equals(students[i].getPass())) {
				students[i].setPass(student.getPass());
				break;
			}
		}
	}

	@Override
	public void remove(Student student) {
		/**4. 회원탈퇴 */
		for(int i=0; i<count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPass().equals(students[i].getPass())) {
				students[i] = students[count-1];
				count--;
				break;
			}
		}
	}

	@Override
	public String checkId(String id) {
		/**5. 아이디 존재 체크 */
		String result = "아이디 존재 체크";
		for(int i=0; i<count; i++) {
			if(id.equals(students[i].getId())) {
				result ="이미 존재하는 아이디";
			}
		}
		return result;
	}

	@Override
	public Student mypage(String id) {
		/**6. 마이페이지 */
		Student student = new Student();
		for(int i=0; i<count; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
		return student;
	}

	@Override
	public void score(int[] arr) {
		/**7. 점수입력 */
		for(int i=0; i<count; i++) {
			students[i].setScore(arr[i]);
		}
	}

	@Override
	public Student[] studentList() {
		/**8. 회원목록 */
		return students;
	}

	@Override
	public Student idSearch(String id) {
		/**9. 아이디검색 */
		Student student = new Student();
		for(int i=0; i<count; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
		return student;
	}

	@Override
	public Student[] searchname(String name) {
		/**10. 이름검색 */
		int cnt = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(students[i].getName())) {
				cnt++;
			}
		}
		Student[] sameName = new Student[cnt];
		int k = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(students[i].getName())) {
				k++;
				if(cnt == k) break;
			}
		}
		return sameName;
	}

	@Override
	public int studentCount() {
		/**11. 전체회원수 */
		return count;
	}

	@Override
	public Student[] gradeRank() {
		/**12. 성적별 현황 */
		for(int i=0; i<count; i++) {
			for(int j=0; j<count; j++) {
				if(students[i].getScore() > students[j].getScore()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		
		return students;
	}
	
	
}
public class PersonApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonService service =new PersonServiceImpl();
		Person person = null;
		Student student = null;
		Admin admin =null;
		while(true) {
			System.out.println(control.MAIN_MENU);
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println(control.STUDENT_MENU);break;
			case 2 : System.out.println(control.ADMIN_MENU);break;
			default: System.out.println("1.학생 2.관리자기능 선택바랍니다.");
		}
	}
}
	public static void admin(Scanner scanner, Admin admin, PersonService service) {
		System.out.println("ADMIN_MANU");
		Person person = null;
		switch(scanner.nextInt()) {
		case 0 : return;
		case 1 : /**8. 회원목록 */
			Student[] list = service.studentList();
			for(Student s : list) {
				System.out.println(s.toString());
			}
			break;
		case 2 : /**9. 아이디검색 */
			System.out.println(service.idSearch("kim".toLowerCase()));
			break;
		case 3 : /**10. 이름검색*/
			Student[] sameNames = service.searchname("이순신");
			for(Student s : sameNames) {
				System.out.println(s.toString());
			}
			break;
		case 4 : /**11.전체회원수 */
			System.out.printf("총 %d 명",service.studentCount());
			break;
		case 5 : /**12.성적별 현황*/
			Student[] ranks = service.gradeRank();
			for(Student s : ranks) {
				System.out.println(s.toString());
			}
			break;
		default:
			break;
		}
	}
	public static void student(Scanner scanner, Student student, PersonService service) {
		System.out.println("STUDENT_MANU");
		// scanner 입력 생략
		String[] id = {"kim", "you", "lee"};
		String[] pass = {"1","1","1"};
		String[] name = {"김유신","유관순","이순신"};
		String[] ssn = {"900101-1","900501-2","900801-1"};
		String result = "";
		switch (scanner.nextInt()) {
		case 0 : return;
		case 1 : /** 1. 회원가입 */
			for(int i=0; i<id.length; i++) {
				student = new Student();
				System.out.println("회원가입");
				System.out.println("아이디 입력: ");
				student.setId(scanner.next());
				System.out.println("비밀번호 입력: ");
				student.setPass(scanner.next());
				service.join(student);
			}
			break;
		case 2 : /**2. 로그인 */
			student = new Student();
			student.setId(id[0]);
			student.setPass("1");
			result = service.loin(student);
			System.out.println(result);
			break;
		case 3 : /**3. 비번수정*/
			student = new Student();
			student.setId(id[2]);
			student.setPass("2");
			service.changpass(student);
			break;
		case 4 : /**4. 회원탈퇴*/
			student.setId(id[0]);
			student.setPass("1");
			service.remove(student);
			break;
		case 5 : /**5. 아이디존재체크 */
			System.out.println(service.checkId("kim"));
			break;
		case 6 : /**6. 마이페이지 */
			System.out.println(service.mypage("kim"));
			break;
		case 7 : /**7. 점수입력*/
			int[] scores = {70, 60, 80, 30};
			service.score(scores);
			break;
			
		default:
			break;
			}
		}
	}
	
	
			


