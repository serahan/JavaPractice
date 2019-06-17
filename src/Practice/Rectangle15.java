package Practice;

public class Rectangle15 implements IDrawable15 {
	private int width;
	private int height;
	
	public Rectangle15(int a, int b)
	{
		this.width = a;
		this.height = b;
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw rectangle(" + this.width + ", " + this.height + ")" );
	}

}
