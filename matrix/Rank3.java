package matrix;

import java.util.Random;

public class Rank3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d등\t%d점\n", i+1, arr[i]);
		}
	}
}
