package D2;
import java.util.Scanner;

public class Solution_1961_d2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("#" + tc + " ");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(a[n-j-1][i]);
				}
				System.out.print(" ");
				for(int j = 0; j < n; j++) {
					System.out.print(a[n-i-1][n-j-1]);
				}
				System.out.print(" ");
				for(int j = 0; j < n; j++) {
					System.out.print(a[j][n-1-i]);
				}
				System.out.println();
			}
		}
	}

}
