import java.util.Scanner;

public class Solution_2058_d1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<4; i++) {
			sum += input%10;
			input = input/10;
		}
		System.out.print(sum);

	}

}
