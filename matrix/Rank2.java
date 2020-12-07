package matrix;

import java.util.Random;

class Student{
	int score;
	String name;
}
public class Rank2 {
	public static void main(String[] args) {
		Student[] score = new Student[5];
		Random random = new Random();
		String[] names = {"철수","영희","짱구","훈이","진구"};
		
		for(int i=0; i<score.length; i++) {
			score[i] = new Student();
			score[i].name = names[i];
			score[i].score = random.nextInt(101);
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; i>j; j++) {
				if(score[i].score > score[j].score) {
					Student temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d등\t%s\t%d점\n", i + 1, score[i].name, score[i].score);
		}
	}
}
