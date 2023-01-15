package baekjoon;


import java.util.Scanner;

public class test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int num1;
		int sum = 0;

//
//		InputStream is = System.in;
//		InputStreamReader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
//		
//		String str = br.readLine();
//		int num = Integer.parseInt(str);
		
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int k = 0; k <= t; k++) {
			String str = sc.nextLine();

			String[] st = str.split(" ");

			int i = st.length;

			if (i == 2) {

				for (int j = 0; j < st.length; j++) {

					num1 = Integer.parseInt(st[j]);

					sum += num1;
					
					
				}
				System.out.println(sum);
				sum=0;
			}
		}
	}

}
