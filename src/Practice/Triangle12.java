package Practice;

public class Triangle12 {
	private int length1;
	private int length2;
	private int length3;
	
	public Triangle12(int a, int b, int c)
	{
		this.length1 = a;
		this.length2 = b;
		this.length3 = c;
	}
	
	public int getLength1()
	{
		return this.length1;
	}
	public int getLength2()
	{
		return this.length2;
	}
	public int getLength3()
	{
		return this.length3;
	}
	
	public void TellLength() 
	{
		System.out.println(length1 + length2 + length3);
	}
	
	public void Draw()
	{
		System.out.println("Draw(" + length1 +"," + length2 + "," +length3 + ")");
	}
	
}
