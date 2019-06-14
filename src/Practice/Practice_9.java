package Practice;

public class Practice_9 
{
	public void practice9() 
	{
		String str = "Hello World";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			if (((65 <= ch[i]) && (ch[i] <= 90)) 
					|| ((97 <= ch[i]) && (ch[i] <= 122))) 
			{
				ch[i] = (char) (ch[i] + 3);
			}
			System.out.print(ch[i]);
		}

	}
}
