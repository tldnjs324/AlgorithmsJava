package D2;

import java.util.Scanner;

public class Solution_1974_d2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수 
		int T = sc.nextInt();
		
		for(int tc = 0; tc<T; tc++) {
			int[][] map = new int[9][9];
			boolean sign = true;
			//테스트케이스 배열 입력받기
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			//행체크
			for(int i = 0; i<9; i++) {
				//각 행 숫자 담을 배열
				int[] arr = new int[9];
				for(int j = 0; j<9; j++) {
					arr[(map[i][j])-1]++;
				}
				for(int j = 0; j<9; j++) {
					if(arr[j] == 0) {
						sign = false;
						break;
					}
				}
			}
			//열체크
			for(int i = 0; i<9; i++) {
				//각 열 숫자 담을 배열
				int[] arr = new int[9];
				for(int j = 0; j<9; j++) {
					arr[(map[j][i])-1]++;
				}
				for(int j = 0; j<9; j++) {
					if(arr[j] == 0) {
						sign = false;
						break;
					}
				}
			}
			//격자체크
			for(int i = 0; i<=6; i+=3) {
				for(int j = 0; j<=6; j+=3) {
					int[] arr = new int[9];
					int r = i+3;
					int c = j+3;
					
					for(int k = i; k<r; k++) {
						for(int l = j; l<c; l++) {
							arr[(map[k][l]-1)]++;
						}
					}
					
					for(int z = 0; z<9; z++) {
						if(arr[z]==0) {
							sign = false;
							break;
						}
					}
				}
			}
			
			if(sign == true) {
				System.out.printf("#%d %d\n", tc, 1);
			}else {
				System.out.printf("#%d %d\n", tc, 0);
			}
			
		}
	}

}
