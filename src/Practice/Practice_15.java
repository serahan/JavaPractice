package Practice;
import Practice.CustomShape15;
import Practice.Rectangle15;
import Practice.Triangle15;
import Practice.MyPaint15;

public class Practice_15 {
	public void practice15()
	{
		MyPaint15 paint = new MyPaint15();
		
		Triangle15 tri = new Triangle15(3, 4, 5);
		paint.DrawShape(tri);
		System.out.println();
		
		Rectangle15 rec = new Rectangle15(5,10);
		paint.DrawShape(rec);
		System.out.println();
		
		CustomShape15 cus = new CustomShape15(5,10,2,2);
		paint.DrawShape(cus);
		System.out.println();
	}
}