package race;

import java.util.Scanner;

public class PlayerApp2{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Player2[] player2s = new Player2[3];
			
			for(int i=0; i<player2s.length; i++) {
				Player2 player2 = new Player2();
				System.out.println("이름을 입력하세요: ");
				player2.setName(scanner.next());
				
				System.out.println("100M 기록을 입력하세요: ");
				player2.setRecode2(scanner.nextInt());
				
				player2s[i] = player2;
			}
				Player2[] ranking = new Player2[3];
				String name = "";
				if(player2s[0].getRecode2() < player2s[1].getRecode2() 
						&& player2s[0].getRecode2() < player2s[2].getRecode2()) {
					name = player2s[0].getName();
					
				}else if(player2s[1].getRecode2() < player2s[0].getRecode2() 
						&& player2s[0].getRecode2() < player2s[2].getRecode2()) {
					name = player2s[1].getName();
				}else {
					name = player2s[2].getName();
				}
				System.out.println("1등" + name);
		}
	}