package D3;

import java.util.Scanner;

public class Solution_12368 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int ans = 0;
		
		for(int i = 0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			ans = A+B;
			if(ans>=24) {
				ans -= 24;
			}
			System.out.println("#" + (i+1) + " " + ans);	
			
		}
	}

}
