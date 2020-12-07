package week1three;

public class ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0;
		
		int[] score = {100,88,100,100,90}; // true
		//int[] score =  new int[]{100,88,100,100,90}; // true
		//int[] score = new int[5]; // 값이 없음
		//score[0]=100; score[1]=88; score[2]=100; score[3]=100; score[4]=90;  // 에러발생
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length; //계산결과를 float로 얻기 위함.
		
		System.out.println("총점:" +sum);
		System.out.println("평균:" +average);
	}
}
