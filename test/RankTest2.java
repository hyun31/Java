package test;

import java.util.Random;

/*
 * 5명의 점수를 입력받아서 1등90점, 2등86점, 3등77점, 4등66점, 5등40점
 * 으로 출력하시오. 출력시 행렬을 반드시 사용하시오 
 * */
public class RankTest2 {
	public static void main(String[] args) {
		Random random = new Random();

		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]);{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d등\t%d점\n", (i+1), arr[i]);
		}
	}
}
