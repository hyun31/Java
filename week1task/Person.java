package week1task;

import java.util.Scanner;

class Animal {
	String name;
	String speak;
	int age;
	
	void show() {
		System.out.println("이름: "+ name +",나이: "+ age + ",기능:" + speak);
	}
}

public class Person {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal animal = new Animal();
		System.out.print("이름: ");
		animal.name = scanner.next();
		System.out.print("나이: ");
		animal.age = scanner.nextInt();
		System.out.print("속성: ");
		animal.speak = scanner.next();
		animal.show();
		
	} 
}
