package Practice;
import Practice.Triangle12;

public class Practice_12 {
	public void practice12()
	{
		int index=1;
		
		Triangle12 tri = new Triangle12(3, 4, 5);

		System.out.println(
				"�ﰢ��" + index + ": A=" + tri.getLength1() + ", B=" + tri.getLength2() + ", C=" + tri.getLength3());
		index++;
		System.out.print("�ѷ����� : ");
		tri.TellLength();
		
		System.out.println();
		
		Triangle12 tri2 = new Triangle12(3,3,3);
		
		System.out.println(
				"�ﰢ��" + index + ": A=" + tri2.getLength1() + ", B=" + tri2.getLength2() + ", C=" + tri2.getLength3());
		index++;
		tri2.Draw();
	}
}
