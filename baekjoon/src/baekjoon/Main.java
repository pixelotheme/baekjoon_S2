package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numA,numB;

		int t = sc.nextInt();
		
		for(int i = 1; i<= t; i++) {
			numA = sc.nextInt();
			numB = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + numA + " + " + numB +" = " + (numA+numB));
		}

	}

}
