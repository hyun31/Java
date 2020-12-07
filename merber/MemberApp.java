package merber;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null; 
		MemberService memberService = new MemberServicesImpl();
			while(true) {
				System.out.println("메뉴 0.종료 1.회원가입 2.로그인 3.회원목록");
				switch (scanner.nextInt()) {
				case 0:
						System.out.println("종료");
					return;
				case 1:
					member = new Member(); 
					System.out.println("회원가입"); //클래스System 변수out = System out 클래스 변수
					
					System.out.println("아이디:");
					member.setUserid(scanner.next()); // 인스턴스변수 : 바로접근 불가 
					
					System.out.println("비밀번호:");
					member.setPassword(scanner.next()); 
					
					System.out.println("이름:");
					member.setName(scanner.next());
					
					System.out.println("*** 회원정보 확인 ***");
					System.out.println(member.toString());
					memberService.join(member);
					break;
					
				case 2:
					System.out.println("로그인");
					break;
					
				case 3:
					System.out.println("목록보기");
					Member[] list = memberService.list();
					for(int i=0; i<3; i++) {
						System.out.println(list[i].toString());
					}
					break;

				default:
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					break;
				}
			}
	}
}
