package week1one;

// 내림차순 정렬하기
public class Test3 {
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<i; j++ ) {
				if(score[i] > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
