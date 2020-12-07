package test;

import java.util.Scanner;

/**
 @author qpwlxm123@gmail.com 
 @since 2020.06.18
 @param kind 종류, company 제조사, call 통화내역
 */

class Product{
	
}
class Tv extends Product{
	public final static String KIND = "텔레비전";
	@Override public String toString() {return String.format("%s",KIND);}
};
class colorTv extends Tv{
	public final static String KIND = "컬러티비";
	@Override public String toString() {return String.format("%s", KIND);}
}

class Computer extends Product{
	public final static String KIND = "컴퓨터";
	@Override public String toString() {return String.format("%s", KIND);}
}

class Notebook extends Computer{
	public final static String KIND = "노트북";
	@Override public String toString() {return String.format("%s", KIND);}
}
class BelPhone extends Product{
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
	//[애플] 아이폰을 사용해서 [이동]중에 [뉴스 검색] 을 한다.
	@Override
	public String toString() {
		return String.format("%s", KIND);

	}
}
class GalPhone extends Iphon{
	protected String pay;
	//[삼성] 갤럭시 제품을 사용해서, [이동]중에 [삼성페이결제] 한다.
	public final static String KIND = "갤럭시";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	
	}
}
public class Etland { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product item = null;
		Product[] cart = new Product[5];
		int index = 0;
		while(true) {
			System.out.println("쇼핑목록: 0.종료 1.아이폰 2.갤럭시 3.컬러TV 4.컴퓨터"
					+ " 5.노트북 6.쇼핑목록보기" );
			switch (scanner.nextInt()) {
			case 0: return;
			case 1: 
				cart[index] = (Iphon)new Iphon(); index++; break;
			case 2:
				cart[index] = (GalPhone)new GalPhone(); index++; break;
			case 3 :
				cart[index] = (colorTv)new colorTv(); index++; break;
			case 4 : 
				cart[index] = (Computer)new Computer(); index++; break;
			case 5 : 
				cart[index] = (Notebook) new Notebook(); index++; break;
			case 6 : 
				System.out.println("구매목록");
					for(Product p : cart) {
						System.out.println(p.toString());
					}
				break;
			default:
				break;
			}
		}
	}
}

