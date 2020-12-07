package week1one;

public class Operator2 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.println("abc"=="abc"); // true
		System.out.println(str1=="abc");  // 
		System.out.println(str2=="abc");  // false 서로 다른 주소 값
		System.out.println(str1==str3);   // true		
		System.out.println(str1.equals("abc")); // true
		System.out.println(str2.equals("abc")); // true
		System.out.println(str2.equals("ABC")); // false 대소문자 구분
		System.out.println(str2.equalsIgnoreCase("ABC")); // true
		System.out.println(str1.equals(str3)); // true
	}
	
}
