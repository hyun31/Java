package sequencetest;
//1~5까지 모두 합한 수를 출력하시오 while문
public class Sequence2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		int i = 0;
		while(true) {
			if(i<arr.length) {
				sum += arr[i];
				i++;
				continue;
			}else {
				break;
			}
		}
		System.out.println(sum);
 	}
}
