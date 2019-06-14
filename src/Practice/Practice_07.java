package Practice;

public class Practice_07 {
	public void practice7() {
		int[][] arr = { { 90, 80, 80 }, 
						{ 85, 85, 95 }, 
						{ 95, 70, 75 }, 
						{ 80, 80, 90 }, 
						{ 90, 75, 80 } };

		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				sum += arr[i][j];
			}
			avg = (double) sum / 3;

			System.out.println("ID = " + i + ": ÇÕ°è = " + sum + ", Æò±Õ = " + Math.round(avg*100)/100.0);
			
			sum=0;
			avg=0.0;
		}
	}
}
