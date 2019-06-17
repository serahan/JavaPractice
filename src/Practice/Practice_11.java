package Practice;

public class Practice_11 {

	public void practice11()
	{
		int result=0;
		System.out.print("(3 + 5 - 2) * 2 / 3 ");
		
		result = Add(3,5);
		result = Sub(result, 2);
		result = Mul(result,2);
		result = Div(result,3);
		
		System.out.println("= " + result);
	}
	
	public int Add(int a, int b)
	{
		return a+b;
	}
	public int Sub(int a, int b)
	{
		return a-b;
	}
	public int Mul(int a, int b)
	{
		return a*b;
	}
	public int Div(int a, int b)
	{
		return a/b;
	}
}
