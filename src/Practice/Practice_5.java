package Practice;

import java.util.Scanner;

public class Practice_5 {

	public void practice5() {
		try (Scanner scanner = new Scanner(System.in)) {

			int score = 0;

			System.out.print("���� �Է� : ");
			score = scanner.nextInt();

			System.out.print("���� : ");
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}
