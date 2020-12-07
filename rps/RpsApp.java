package rps;

import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

/*
"가위 바위 보를 고르세요."
"1.가위 2.바위 3.보"
********************
"플레이어: 가위"
"컴퓨터: 보"
"플레이어 승리(  || 패배 | 무승부 )"
 * */
public class RpsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		System.out.println("가위 바위 보를 고르세요.");
		System.out.println("1.가위 2.바위 3.보");
		
		int player = scanner.nextInt();
		int computer = random.nextInt(3)+1; // 1,2,3
		String result = "";
		
		if(player == 1 && computer == 1) {
			result = "무승부";
		}else if(player ==1 && computer == 2) { 
			result = "패배";
		}else if (player ==1 && computer == 3) {  
			result = "승리";
//		}else if (player ==0 && computer == 1) {  
//			result = "에러";
//		}else if (player ==1 && computer == 0) {  
//			result = "에러";
		}
		
		if(player == 2 && computer == 2) { 
			result = "무승부";
		}else if(player ==2 && computer == 1) { 
			result = "패배";
		}else if (player ==2 && computer == 3) {
			result = "승리";
//		}else if (player ==0 && computer == 2) {  
//			result = "에러";
//		}else if (player ==2 && computer == 0) {  
//			result = "에러";
		}
		
		if(player == 3 && computer == 3) { 
			result = "무승부";
		}else if(player ==3 && computer == 1) { 
			result = "패배";
		}else if (player ==3 && computer == 2) { 
			result = "승리";
//		}else if (player ==0 && computer == 3) {  
//			result = "에러";
//		}else if (player ==3 && computer == 0) {  
//			result = "에러";
		}
		
		System.out.println("플레이어:"+ player);
		System.out.println("컴퓨터:"+ computer);
		System.out.println("플레이어:"+ result);
		}
	
}

