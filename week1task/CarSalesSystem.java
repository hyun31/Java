package week1task;

import java.awt.Graphics;
import java.awt.Point;
/*
  실습: 차량판매시스템
선택하세요. [0:나가기, 1:차량등록, 2:고객등록, 3. 차량조회,//(기본) 
             4: 고객조회, 5:차량판매]도전과제 5번
[차량등록]
차량번호: 111
차량크기(소형(1)/중형(2)/대형(3)): 2
차량타입(세단(1)/SUV(2)): 1

[고객등록]
고객번호: 122
고객명: 홍길동

[차량조회]
차량번호: 111
차량크기(소형(1)/중형(2)/대형(3)): 2
차량타입(세단(1)/SUV(2)): 1
--------------
[고객조회]
고객번호: 111
고객명: 홍길동
-------------
[차량판매]
고객번호를 등록하세요[0:취소]: 122
차량번호를 등록하세요[0:취소]: 111

====================================================================

* 차량등록 시 중복체크
   ‘차량번호가 중복됩니다’

* 차량판매 시
   - 존재하는 고객번호일 때까지 ‘고객번호를 등록하세요’
   - 존재하는 차량번호일 때까지 ‘차량번호를 등록하세요’

  - 판매된 차량번호이면 ‘판매된 차량번호 입니다. 차량번호를 등록하세요’

 * */
import java.util.Scanner;

class Car {
	int id; // 차량번호

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int size; // 차량크기

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	int type; // 차량타입

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}

class Name extends Car { // 고객정보
	String name; // 고객명

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	int nameid; // 고객번호

	public void setNameid(int nameid) {
		this.nameid = nameid;
	}

	public int getNameid() {
		return nameid;
	}

}

public class CarSalesSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[100]; // 차량
		Name[] people = new Name[100];// 고객
		int count = 0; // 차량 체크
		int cnt = 0; // 고객 체크
		int carindex = 0; // 판매 체크
		Loop3: while (true) {
			System.out.println("메뉴>> 0.나가기 1.차량등록 2.고객등록 3.차량조회 4.고객조회 5.차량판매 ");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("나가기");
				return;
			case 1:
				Car car = new Car(); // 차량정보
				System.out.println("차량등록 입니다.");
				System.out.println("차량번호:");
				car.setId(scanner.nextInt());
				System.out.println("차량크기: 소형(1)|중형(2)|대형(3)");
				car.setSize(scanner.nextInt());
				System.out.println("차량타입: 세단(1)|SUV(2)");
				car.setType(scanner.nextInt());
				cars[count] = car;
				count++;
				for (int i = 0; i < count - 1; i++) {
					if (car.getId() == cars[i].getId()) {
						System.out.println("중복된 차량번호 입니다.");
						count--;
					} else {
						System.out.println("등록완료");
					}
				}
				break;
			case 2:
				Name name = new Name(); // 고객정보
				System.out.println("고객등록 입니다.");
				System.out.println("고객번호:");
				name.setNameid(scanner.nextInt());
				System.out.println("고객이름:");
				name.setName(scanner.next());
				people[cnt] = name;
				cnt++;

				break;
			case 3:
				System.out.println("차량조회 입니다.");
				System.out.println("차량번호:");
				int caca = scanner.nextInt();
				for (int j = 0; j < count; j++) {
					if (cars[j].getId() == caca)
						System.out.printf("차량번호: %d%n 차량크기소형(1)|중형(2)|대형(3): %d%n 차량타입세단(1)|SUV(2): %d%n",
								cars[j].getId(), cars[j].getSize(), cars[j].getType());
				}
				break;
			case 4:
				System.out.println("고객조회 입니다.");
				System.out.println("고객조회:");
				int nana = scanner.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (people[i].getNameid() == nana)
						System.out.printf(" 고객번호: %d 고객명: %s%n", people[i].getNameid(), people[i].getName());
				}
				break;
			case 5:
				int carsalse = 0;
				int namesalse = 0; // 고객 및 차량
				System.out.println("차량판매 입니다");
				Loop1: while (true) {
					System.out.println("고객번호를 등록하세요[0:취소]");
					namesalse = scanner.nextInt();

					for (int i = 0; i < cnt; i++) {
						if (people[i].getNameid() == namesalse) {
							System.out.println("존재하는 고객입니다.");
							break Loop1; // 고객번호 확인을 끝내고 차량번호 확인
						} else {
							if (namesalse == 0) {
								System.out.println("취소되었습니다.");
								continue Loop3; // 메뉴로 이동
							}
						}
					}
				}
				Loop2: while (true) {
					System.out.println("차량번호를 등록하세요[0:취소]");
					carsalse = scanner.nextInt();
					for (int i = 0; i < count; i++) {
						if (cars[i].getId() == carsalse) { // car 0 = carsalse = 0 인 경우 존재하는 차량번호
							System.out.println("존재하는 차량번호 입니다.");
							carindex = i; // car 0 이면 i가 carindex 전달
							break Loop2;
						} else {
							if (carsalse == 0) {
								System.out.println("취소되었습니다.");
								// continue Loop3;
							}
						}
					}
				}
				System.out.println("차량 판매시스템");
				for (int i = 0; i < count; i++) {
					// 배열[]cars0 id == 배열[]carindex에 있는 것을 비교
					if (cars[i].getId() == cars[carindex].getId()) {
						System.out.println("이미 판매되었습니다.->중복"); break;
					}else if(cars[i].getId() == cars[carindex].getId()) {
						System.out.println("아직 남아있습니다.-> 판매완료");
					}
					
					
//					if (cars[i].getId() == cars[carindex].getId()) { 
//						System.out.println("판매완료된 차량입니다.");
//					} else {
//						if (carindex == 0) {
//							System.out.println("아직 판매되지 않는 차량입니다");
//						}
//					}
//					for(int j =i; j<count-1; j++) {
//						cars[j] = cars[j+1];
//					}
//					System.out.println(cars[i].getId());
				}
				break;
			}
		}
	}
}
