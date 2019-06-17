package Practice;
import Practice.Triangle;

public class Practice_12 {
	public void practice12()
	{
		int index=1;
		
		Triangle tri = new Triangle(3, 4, 5);

		System.out.println(
				"»ï°¢Çü" + index + ": A=" + tri.getLength1() + ", B=" + tri.getLength2() + ", C=" + tri.getLength3());
		index++;
		System.out.print("µÑ·¹±æÀÌ : ");
		tri.TellLength();
		
		System.out.println();
		
		Triangle tri2 = new Triangle(3,3,3);
		
		System.out.println(
				"»ï°¢Çü" + index + ": A=" + tri2.getLength1() + ", B=" + tri2.getLength2() + ", C=" + tri2.getLength3());
		index++;
		tri2.Draw();
	}
}
