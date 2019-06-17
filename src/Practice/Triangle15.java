package Practice;
import Practice.IDrawable15;

public class Triangle15 implements IDrawable15{
	private int length1;
	private int length2;
	private int length3;
	
	public Triangle15(int a, int b ,int c)
	{
		this.length1=a;
		this.length2=b;
		this.length3=c;
	}
	
	public void Draw()
	{
		System.out.println("Draw triangle(" + this.length1+", " + this.length2 + ", " + this.length3 + ")");
	}
}
