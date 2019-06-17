package Practice;
import Practice.FourFunc12;

public class Practice_13 {
	public void practice13()
	{
		FourFunc12 four1 = new FourFunc12();
		
		four1.setIntNum1(20);
		four1.setIntNum2(10);
		
		System.out.println("a=" + four1.getIntNum1()+", b=" + four1.getIntNum2());
	
		System.out.println("사칙연산 결과 : " + 
				four1.Add(four1.getIntNum1(),four1.getIntNum2()) + ", " +
				four1.Sub(four1.getIntNum1(),four1.getIntNum2()) + ", " +
				four1.Mul(four1.getIntNum1(),four1.getIntNum2()) + ", " +
				four1.Div(four1.getIntNum1(),four1.getIntNum2())
				);
		
		System.out.println();
		
		FourFunc12 four2 = new FourFunc12();
		
		four2.setDoubleNum1(20.5);
		four2.setDoubleNum2(10.5);
		
		System.out.println("x=" + four2.getDoubleNum1() +", b=" + four2.getDoubleNum2());
		
		System.out.println("사칙연산 결과 : " + 
				four2.Add(four2.getDoubleNum1(),four2.getDoubleNum2()) + ", " +
				four2.Sub(four2.getDoubleNum1(),four2.getDoubleNum2()) + ", " +
				four2.Mul(four2.getDoubleNum1(),four2.getDoubleNum2()) + ", " +
				four2.Div(four2.getDoubleNum1(),four2.getDoubleNum2())
				);
	}
}
