package Practice;

public class CustomShape15 implements IDrawable15 {
	private int width;
	private int height;
	private int x;
	private int y;
	
	public CustomShape15(int a, int b, int c, int d)
	{
		this.width=a;
		this.height=b;
		this.x=c;
		this.y=d;
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw customSahpe(" + this.width + ", " + this.height + ", " + this.x + ", " + this.y + ")" );
	}

}
