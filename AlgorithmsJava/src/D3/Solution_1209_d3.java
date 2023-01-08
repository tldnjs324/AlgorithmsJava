package D3;

import java.util.Scanner;

public class Solution_1209_d3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int T = 0; T<10; T++) {
			int tc = sc.nextInt();
			int[][] a = new int[100][100];
			
			//배열 입력
			for(int i = 0; i<100; i++) {
				for(int j = 0; j<100; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			int sum1, sum2 = 0;
			//행, 열 덧셈
			for(int i = 0; i<100; i++) {
				sum1 = sum2 = 0;
				for(int j = 0; j<100; j++) {
					sum1 += a[i][j];
					sum2 += a[j][i];
				}
				if(sum1 > max) {
					max = sum1;
				}
				if(sum2 > max) {
					max = sum2;
				}
			}
			//대각선 덧셈
			sum1 = sum2 = 0;
			for(int i = 0; i<100; i++) {
				sum1 += a[i][i];
				sum2 += a[i][99-i];
			}
			if(sum1 > max) {
				max = sum1;
			}
			if(sum2 > max) {
				max = sum2;
			}
			System.out.printf("#%d %d\n", tc, max);
		}

	}

}
