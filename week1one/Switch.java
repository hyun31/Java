package week1one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("당신의 학점은:");
		char grade = in.readLine().charAt(0);
		switch(grade) {
		case 'A': System.out.println("참 잘했어요");
		break;
		case 'B': System.out.println("그냥 잘 했어요");
		break;
		case 'C': System.out.println("남들만큼 했어요");
		break;
		case 'D': System.out.println("낙제는 면햇어요");
		break;
		case 'E': System.out.println("참 잘 놀았어요");
		break;
		default: System.out.println("그런 학점은 없는데요..");
		break;
		}
	}
}
