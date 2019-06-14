package Practice;

public class Practice_8 {
	public void practice8()
	{
		String str = "Hello, World";
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if ((97 <= ch[i]) && (ch[i] <= 122))
			{
				ch[i] = (char) (ch[i] - 32);
			}
			else if ((65 <= ch[i]) && (ch[i] <= 90))
			{
				ch[i] = (char) (ch[i] + 32);
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}
