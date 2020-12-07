package matrix;

import java.util.Random;

public class Rank4 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d등%d점\n", (i+1), arr[i]);
		}
	}
}
