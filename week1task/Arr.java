package week1task;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int[] irr = {1,2,3,4,5,6,7};
		System.out.println("1-10 숫자 입력:");
		int number = scanner.nextInt();
		int temp;
		for(int i =0; i<number; i++) {
			for(int j= 0; j<6; j++) {
				temp=irr[j];
				irr[j]=irr[j+1];
				irr[j+1]=temp;}
		}
		for(int i = 0; i < irr.length; i++) {
			System.out.print(irr[i]+"");
		}
	}
}


	

