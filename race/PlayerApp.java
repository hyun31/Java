package race;
import java.util.Scanner;

public class PlayerApp { // 클래스형태, 키워드 아이디 {}
	public static void main(String[] args) { // 메소드형태, 키워드 아이디() {}
		Scanner scanner = new Scanner(System.in); // ;으로 끝나면 statement 
		Player[] players = new Player[3];

		for(int i=0; i<3; i++) { // {으로 끝나면 cf statement 
			Player player = new Player();

			System.out.println("Player 이름을 입력하세요: ");
			player.setName(scanner.next()); 

			System.out.println("기록을 입력하세요");
			player.setRecord(scanner.nextInt());

			players[i] = player;
		}
			for(int i=0; i<3; i++) {
				players[i].printStates();
			}
	}
}