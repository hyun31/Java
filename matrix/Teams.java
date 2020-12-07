package matrix;
// matrix 구조로 출력
/*
 "철수", "영희", "둘리", "짱구"
 "안녕", "인사", "하이", "헬로"
 "영어", "한글", "숫자", "불어"
 "종교", "유교", "불교", "교회"
 * */
public class Teams {
	public static void main(String[] args) {
		String[][] teams = {{"철수", "영희", "둘리", "짱구"},
		{"안녕", "인사", "하이", "헬로"},
		{"영어", "한글", "숫자", "불어"},
		{"종교", "유교", "불교", "교회"}};
		
		for(int i=0; i<teams.length; i++) {
			for(int j=0; j<teams.length; j++) {
				System.out.printf("%s\t",teams[i][j]);
			}
			System.out.println();
		}
	}
}