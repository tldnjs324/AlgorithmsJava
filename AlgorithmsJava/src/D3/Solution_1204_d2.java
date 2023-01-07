package D3;

import java.util.Scanner;

public class Solution_1204_d2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
        T = sc.nextInt();
        
        int[] counts;
        int max_count, i, num, max_num;
        for(int tc=0; tc<T; tc++) {
            int a = sc.nextInt();
            counts = new int[101];
            max_count = 0;
            for(i=0; i<1000; i++) {
                num = sc.nextInt();
                counts[num]++;
                if( counts[num] > max_count ) {
                	max_count = counts[num];
                }
            }
            max_num = -1;
            for(i=0; i<101; i++) {
                if( counts[i] != max_count ) continue;
                max_num = i;    
            }
            System.out.format("#%d %d\n", a, max_num);
        }
	}

}
