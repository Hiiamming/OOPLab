package Main;
import java.util.Scanner;

public class Ex63 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n- i - 1; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		scanner.close();
		}
	}
		
}