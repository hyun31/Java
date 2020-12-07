package sample;

public interface SampleService {
	//회원가입
	public void join(Sample sample);         
	//로그인
	public String login(Sample sample);
	//회원목록
	public Sample[] list();
	//아이디 체크
	public String existid(Sample sample);
	//아이디 검색
	public String searchid(Sample sample);  
	//회원탈퇴
	public String cntid(Sample sample);    
	//이름검색
	public String namesearch(Sample sample); 
	//전체회원수
	public Sample[] flist();                
	//마이페이지
	public String mypage(Sample sample);    
	//비밀번호 변경
	public String changepw(Sample sample);  
}
/*
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 * */