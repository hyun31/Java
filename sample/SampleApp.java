/*
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입 o
 * 2. 로그인 o
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크 o
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록 o
 * 8. 아이디검색 o
 * 9. 이름검색 o
 * 10. 전체 회원수 o
 * */
package sample;

import java.util.Scanner;

public class SampleApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sample sample = null;
		SampleService sampleService = new SampleServiceImpl();
		while(true) {
			System.out.println("메뉴: 0.종료 1.회원가입 2.로그인 " + "3.비밀번호 변경" 
					+ " 4.회원탈퇴 " + "5.아이디존재 " + "6.마이페이지 "
							+ "7.회원목록" + " 8.아이디검색 " + "9.이름검색 " + "10.전체회원수");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : 
				sample = new Sample();//객체
				System.out.println("회원가입");
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				sample.setPassword(scanner.next());
				System.out.println("이름: ");
				sample.setName(scanner.next());
				sampleService.join(sample); //요소 
				break;
				
			case 2 : 
				System.out.println("로그인");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				sample.setPassword(scanner.next());
				String result = sampleService.login(sample);
				System.out.println(result);
				break;
				
			case 3 :
				System.out.println("비밀번호 변경");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				System.out.println("기본 비밀번호: ");
				sample.setPassword(scanner.next());
				System.out.println("새로운 비밀번호: ");
				sample.setPassword(scanner.next());
				String resultid = sampleService.changepw(sample);
				System.out.println(resultid);
				break;
				
			case 4 : 
				System.out.println("회원탈퇴하기");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				result = sampleService.cntid(sample);
				System.out.println(result);
				break;
				
			case 5 : 
				System.out.println("아이디 체크");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				result = sampleService.existid(sample);
				System.out.println(result);
				break;
				
			case 6 : 
				System.out.println("마이페이지 입니다.");
				sample = new Sample();
				System.out.println("아이디: "+sample.getUserid());
				sample.setUserid(scanner.next());
				System.out.println("이름: "+sample.getName());
				
				break;
				
			case 7 :
				System.out.println("회원목록보기");
				Sample[] list = sampleService.list();
				for(int i=0; i<3; i++) {
					System.out.println(list[i].toShow());
				}break;
				
			case 8 :
				System.out.println("아이디 검색");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				result = sampleService.searchid(sample);
				System.out.println(result);
				break;
				
			case 9 :
				System.out.println("이름 검색");
				sample = new Sample();
				System.out.println("이름: ");
				sample.setName(scanner.next());
				result = sampleService.namesearch(sample);
				System.out.println(result);
				break;
				
			case 10 : 
				System.out.println("전체 회원수");
				Sample[] Flist = sampleService.list();
				for(int i=0; i<3; i++) {
					System.out.println(Flist[i].toShow());
				}break;
				
				default : 
					System.out.println("메뉴가 없는 기능입니다.");
					break;
				
			}
		}
	}
}
