package sequencetest;
//1~5까지 모두 합한 수를 출력하시오 for문
public class Sequence {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
