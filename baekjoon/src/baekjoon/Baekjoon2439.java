package baekjoon;

import java.util.Scanner;

public class Baekjoon2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int aLine = 0;
		
		String str = "";
		String str2 = "";
		String blank = " ";
		
		//항상 총 개수는 a 개를 넘지못하니 입력시 a개의 *를 넣어준다
		for(int e = 0; e < a; e++) {
			str += blank;
		}
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 1; i <= a; i++) {
			aLine = a - i;
			
			//4번째에 *를 넣어준다 
			// 지정된 위치의 문자 교체
	        sb.setCharAt(aLine, '*');
	        str2 = sb.toString();
	        System.out.println(str2);
			
		}
	}

}
