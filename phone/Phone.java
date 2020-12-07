package phone;

import java.util.Scanner;


/**
 @author qpwlxm123@gmail.com 
 @since 2020.06.18
 @param kind 종류, company 제조사, call 통화내역
 */
class BelPhone{
	protected String kind, company, call;
	
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getCall() {return call;}
	public void setCall(String call) {this.call = call;}

	@Override 
	public String toString() {
		return "집전화기 [폰종류=" + kind + ","
				+ " 제조사=" + company + ","
						+ " 통화내역=" + call + "]";
	}
}


class CelPhone extends BelPhone{
	public final static String KIND = "휴대폰";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {return portable;}
	public void setPortable(boolean portable) {
		move =(portable) ? "이동중에":"이동불가능"; 
		this.portable = portable;
		}
	public String getMove() {return move;}
	public void setMove(String move) {this.move = move;}
	@Override
	public String toString() {
		return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다", 
				KIND, company, call, move);
	
	}
}
class Iphon extends CelPhone{
	public final static String KIND = "아이폰";
	protected String search;
	
	public String getSearch() {return search;}
	public void setSearch(String search) {this.search = search;}
	//[애플] 아이폰을 사용해서 [이동]중에 [뉴스 검색] 을 한다.
	@Override
	public String toString() {
		return String.format("%s 아이폰을 사용해서 %s 제품을 사용해서 %s 한다", 
				KIND, company, move, search);

	}
}
class GalPhone extends Iphon{
	protected String pay;
	//[삼성] 갤럭시 제품을 사용해서, [이동]중에 [삼성페이결제] 한다.
	public final static String KIND = "갤럭시";
	public String getPay() {return pay;}
	public void setPay(String pay) {this.pay = pay;}
	@Override
	public String toString() {
		return String.format("%s 갤럭시 제품을 사용해서, %s 중에 %s 한다.", 
				KIND, company, move, pay);
	
	}
}
public class Phone { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BelPhone phone = null;
		BelPhone[] arr = new BelPhone[1];
		CelPhone cel = null;
		Iphon iphone = null;
		GalPhone galPhone = null;
		while(true) {
			System.out.println("0.종료 1.집전화걸기 2.전화받기 3.휴대폰걸기 4.아이폰서치"
					+ "5.삼성페이결제" );
			switch (scanner.nextInt()) {
			case 0: return;
			case 1: 
				phone = new BelPhone();
				phone.setKind("집전화");	
				phone.setCompany("금성사");
				phone.setCall("안녕하세요");
				arr[0] = phone;
				break;
			case 2:
				System.out.println(arr[0].toString());
				break;
			case 3 :
				cel = new CelPhone();
				cel.setCompany("노키아");
				cel.setPortable(true);
				cel.setCall("이동중에 통화하고 있다.");
				arr[0] = cel;
				break;
			case 4 : 
				iphone = new Iphon();
				iphone.setCompany("애플");
				iphone.setPortable(true);
				iphone.setSearch("뉴스 검색");
				arr[0] = iphone;
				break;
			case 5 :
				galPhone = new GalPhone();
				galPhone.setCompany("갤럭시");
				galPhone.setPortable(true);
				galPhone.setPay("삼성페이결제");
				arr[0] = galPhone;
				break;
			default:
				break;
			}
		}
	}
}

