package dice;

import java.util.Random;
import java.util.Scanner;
//"주사위를 굴려라."
//"1 ~ 6"
//"*******************"
//"플레이어: 3"
//"컴퓨터: 1"
//"플레이어 승리( || 패배 || 무승부)"
public class Dice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("메뉴 1.시작 0.종료");
			switch(scanner.nextInt()) {
			case 0: System.out.println("게임종료");return;
			case 1: game(scanner,random);break;
				}
			}
		}
		
	private static void game(Scanner scanner, Random random) {
		System.out.println("주사위를 굴려라!");
		System.out.println("숫자는 1 ~ 6까지 있습니다.");
		int user = scanner.nextInt();
		int computer = random.nextInt(6)+1;
		String result = "";
		
		if(user == 1 && computer == 2) {result = "패배";
		}else if (user == 1 && computer == 3) {result = "패배";
		}else if (user == 1 && computer == 4) {result = "패배";
		}else if (user == 1 && computer == 5) {result = "패배";
		}else if (user == 1 && computer == 6) {result = "패배";
		
		}else if (user == 2 && computer == 1) {result = "승리";
		}else if (user == 2 && computer == 3) {result = "패배";
		}else if (user == 2 && computer == 4) {result = "패배";
		}else if (user == 2 && computer == 5) {result = "패배";
		}else if (user == 2 && computer == 6) {result = "패배";
		
		}else if (user == 3 && computer == 1) {result = "승리";
		}else if (user == 3 && computer == 2) {result = "승리";
		}else if (user == 3 && computer == 4) {result = "패배";
		}else if (user == 3 && computer == 5) {result = "패배";
		}else if (user == 3 && computer == 6) {result = "패배";
		
		}else if (user == 4 && computer == 1) {result = "승리";
		}else if (user == 4 && computer == 2) {result = "승리";
		}else if (user == 4 && computer == 3) {result = "승리";
		}else if (user == 4 && computer == 5) {result = "패배";
		}else if (user == 4 && computer == 6) {result = "패배";
		
		}else if (user == 5 && computer == 1) {result = "승리";
		}else if (user == 5 && computer == 2) {result = "승리";
		}else if (user == 5 && computer == 3) {result = "승리";
		}else if (user == 5 && computer == 4) {result = "승리";
		}else if (user == 5 && computer == 6) {result = "패배";
		
		}else if (user == 6 && computer == 1) {result = "승리";
		}else if (user == 6 && computer == 2) {result = "승리";
		}else if (user == 6 && computer == 3) {result = "승리";
		}else if (user == 6 && computer == 4) {result = "승리";
		}else if (user == 6 && computer == 5) {result = "승리";
		}else {result = "무승부";}
		
		String diceA = dice(user);
		String diceB = dice(computer);
		
		System.out.println("**********************");
		System.out.println("유저: " +user);
		System.out.println("컴퓨터: " +computer);
		System.out.println("유저: " +result);
	}
		
		private static String dice(int user) {
		String diceA ="";
		
		switch(user) {
		case 0: diceA = "주사위 1";break;
		case 1: diceA = "주사위 2";break;
		case 2: diceA = "주사위 3";break;
		case 3: diceA = "주사위 4";break;
		case 4: diceA = "주사위 5";break;
		case 5: diceA = "주사위 6";break;
		}
		return diceA;
	}
	
}

