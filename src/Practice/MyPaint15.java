package Practice;
import java.util.*;
import Practice.IDrawable15;

public class MyPaint15 {
	List<IDrawable15> list = new ArrayList<IDrawable15>();
	
	public void DrawShape(IDrawable15 shape)
	{
		list.add(shape);
		
		for(int i=0;i<list.size();i++)
		{
			list.get(i).Draw();
		}
	}
}
