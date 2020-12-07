package week1five;

import week1four.Super;

/*
 •실습: 다음 클래스 설계
Vehicle, Car, Autobicycle를 설계하시오

Vehicle
- 속성:String 주인명, int 연식,String 색상
- 메소드:이동한다

Car
- 속성:String 주인명, int 연식,String 색상, String차종류
- 메소드:이동한다, 주유한다

Autobicycle
- 속성:String 주인명, int 연식,String 색상, String오토바이종류
- 메소드:이동한다, 주유한다

 * */
//부모
class Vehicle implements Cloneable{
	// 멤버변수
	private String name;
	private int Year;
	private String Color;

	// 생성자
	Vehicle() {

	}

	public void Vehicle(int Year, String Color) {
		this.Year = Year;
		this.Color = Color;
	}

	// 메소드
	public String getVname() {
		return name;
	}

	public void setVname(String vname) {
		this.name = vname;
	}

	public int getVYear() {
		return Year;
	}

	public void setVYear(int vYear) {
		this.Year = vYear;
	}

	public String getvColor() {
		return Color;
	}

	public void setvColor(String vColor) {
		this.Color = vColor;
	}

	public void move() {
		System.out.println("이동하다");
	}
	public Object clone() { //Override
		Object obj = null;
		try {
			obj = Super.clone();
		}
	}
}

class Car extends Vehicle {
	private String carType;

	Car() {

	}

	public void Car(int Year, String Color, String carType) {

		this.carType = carType;
	}

	public String getCarType() {return carType;}
	public void setCarType(String carType) {this.carType = carType;}

	/* 이동 */
	public void move() {
		System.out.println("Car로 이동하다");
	}

	/* 주유 */
	public void Gasoline() {
		System.out.println("");
	}
}

class Autobicycle extends Vehicle {
	private String Autobicycle;

	Autobicycle() {

	}

	public Autobicycle(String aname, String ackind, int Year) {

	}

	public String getAutobicycle() {return Autobicycle;}
	public void setAutobicycle(String autobicycle) {}

	/* 이동 */
	public void move() {
		System.out.println("오토바이로 이동하다");
	}

	/* 주유 */
	public void Gasoline() {
		System.out.println("");
	}

}

public class VehicleApp {
	public static void main(String[] args) {
		Vehicle[] vs = new Vehicle[3];
		vs[0] = new Car(5, "blue", "소나타");
	}
}
