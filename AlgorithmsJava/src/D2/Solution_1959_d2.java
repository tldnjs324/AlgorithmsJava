package D2;
import java.util.Scanner;
import javax.print.attribute.IntegerSyntax;

//두개의 숫자열
public class Solution_1959_d2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 0; tc<T; tc++) {
			int N = sc.nextInt();//배열A 크기
			int M = sc.nextInt();//배열B 크기
			
			//배열 만들기
			int[] A = new int[N];
			int[] B = new int[M];
			//배열 입력
			for(int i = 0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			for(int i = 0; i<M; i++) {
				B[i] = sc.nextInt();
			}
			
			int max = 0;
			
			if(N<M) {
				for(int i = 0; i<M-N+1; i++) {
					int sum = 0;
					for(int j = 0; j<N; j++) {
						sum += A[j]*B[j+i];
					}
					if(max<sum) {
						max = sum;
					}
				}
			}else//M<N: B<A 혹은 같을 때
			{
				for(int i = 0; i<N-M+1; i++) {
					int sum = 0;
					for(int j = 0; j<M; j++) {
						sum += A[j+i]*B[j];
					}
					if(max<sum) {
						max = sum;
					}
				}
			}
			System.out.printf("#%d %d\n", tc+1, max);
			
		}

	}

}
