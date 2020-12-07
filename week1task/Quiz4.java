package week1task;

import week1task.Members;
import week1task.SpecialMember;

/**
 * 실습: SpecialMember, Member를설계하시오
  Member m = new Member(“김길동”);
  m.setGrade(“3”);
  m.hello(); // 안녕하세요 김길동입니다
  SpecialMember sm= new SpecialMember(“홍길동”);
  sm.setGrade(“1”);
  sm.setSpecialPoint(100); // SpecialMember만 specialPoint관리
  Member m2 = sm;
  m2.hello(); // 안녕하세요 스패설멤버홍길동입니다
 */
class Members {
		String grade;
		String name;
		public Members(String name) {
			this.name = name;
		}
		public String getName() {return name;}
		public void setName(String n) {this.name = name;}
		public String getGrade() {return grade;}
		public void setGrade(String g) {this.grade = grade;}
		public void hello() {
			System.out.printf("안녕하세요 %s입니다.%n",name);
		}
	}
	class SpecialMember extends Members{
		int specialPoint;
		public int getSpecialPoint() {
			return specialPoint;
		}
		public SpecialMember(String name) {
			super(name);
		}
		void setSpecialPoint(int a) {
			specialPoint = a;
		}
		public void hello() {
			System.out.printf("안녕하세요 스페셜멤버 %s입니다.%n",name);
		}
	}
	public class Quiz4 {
		public static void main(String[] args) {
			Members m = new Members("김길동");
			m.setGrade("3");
			m.hello();
			
			SpecialMember sm = new SpecialMember("홍길동");
			sm.setGrade("1");
			sm.setSpecialPoint(100);
			
			Members m2 = sm;
			m2.hello();
		}
	}
	



