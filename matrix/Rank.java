package matrix;

import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

/*
 * 5명의 점수를 입력받아서 1등90점, 2등86점, 3등77점, 4등66점, 5등40점
 * 으로 출력하시오. 출력시 행렬을 반드시 사용하시오 
 * */
public class Rank {
	public static void main(String[] args) {
			Scanner scanner =  new Scanner(System.in);
			Random random = new Random();
			int[] score = new int[5];
			int[] rank = new int[5];
			
			for(int i=0; i<score.length; i++) {
				score[i] = random.nextInt(101);
				rank[i] = 1;
			}
				for(int i=0; i<rank.length; i++) {
					for(int j=0; j<rank.length; j++) {
					if(score[i] < score[j]) {
						rank[i] ++;
				}
			}
		}	
				for(int i=0; i<rank.length; i++) {
					System.out.printf("%d등: %d점\n", rank[i], score[i]);
				}
	}
}