package D2;

import java.util.Scanner;

public class Solution_1204_d2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
        T = sc.nextInt();
        
        for(int tc=0; tc<T; tc++) {
            int a = sc.nextInt();
            int[] counts = new int[101];
            int max_count = 0;
            for(int i=0; i<1000; i++) {
                int num = sc.nextInt();
                counts[num]++;
                if( counts[num] > max_count ) {
                	max_count = counts[num];
                }
            }
            int max_num = -1;
            for(int i=0; i<101; i++) {
                if( counts[i] != max_count ) continue;
                max_num = i;    
            }
            System.out.format("#%d %d\n", a, max_num);
        }
	}
}
