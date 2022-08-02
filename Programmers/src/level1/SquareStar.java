package level1;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int e = 0; e < a; e++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
