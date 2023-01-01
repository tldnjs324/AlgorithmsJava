import java.util.Scanner;

public class Solution_1936_d1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//A가 이기는 경우 1가위 2바위 3보
		if(A == 1 && B == 3) {
			System.out.println("A");
		}else if(A == 2 && B == 1) {
			System.out.println("A");
		}else if(A == 3 && B == 2) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}


	}

}
