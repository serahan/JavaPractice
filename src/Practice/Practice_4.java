package Practice;
import java.util.Scanner;

public class Practice_4 {

	public void practice4() 
	{
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter line number : ");
		num = scanner.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
