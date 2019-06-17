package Practice;

import java.util.Scanner;

public class Practice_10 
{
	public void practice10() 
	{
		int[] arr1 = { 80, 90, 95, 75, 70 };
		int[] arr2 = { 90, 85, 85, 85, 80 };
		char alp = 'A';
		int sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print((char)alp + " : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		MakeSum(arr1, alp);
		alp++;
		
		System.out.println();
		
		System.out.print((char)alp + " : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		MakeSum(arr2, alp);
		
		scanner.close();
	}

	public void MakeSum(int[] arr, char alp) 
	{
		int sum = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			sum += arr[i];
		}
		System.out.println("Sum("+alp+") = "+sum);
	}
}

