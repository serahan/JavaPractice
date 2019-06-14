package Practice;

import java.util.Scanner;

public class Practice_06 {
	public void practice6() {
		int[] arr = new int[10];
		int sum = 0;
		double avg = 0.0;

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("점수 : ");
			for (int i = 0; i < 10; i++) {
				arr[i] = scanner.nextInt();
				sum += arr[i];
			}
			avg = (double) sum / 10;

			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		}
	}
}
