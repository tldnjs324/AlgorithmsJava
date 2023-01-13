package D3;

import java.util.Scanner;

public class Solution_13218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		for(int i = 1; i<=T; i++) {
			int tc = sc.nextInt();
			answer = tc/3;
			System.out.println("#"+i+" "+answer);
		}

	}

}
