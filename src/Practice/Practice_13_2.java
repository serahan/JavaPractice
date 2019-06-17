package Practice;
import Practice.Generic;

public class Practice_13_2 {
	public void practice13_2()
	{
		Generic<Integer> g = new Generic<Integer>(20,10);
		
		System.out.println("a=" + g.get1() + ", b=" + g.get2());
		System.out.println(
				"사칙연산 결과 : " + g.Add(g.get1(),g.get2()) + 
				", " + g.Sub(g.get1(), g.get2()) +
				", " + g.Mul(g.get1(), g.get2()) +
				", " + g.Div(g.get1(), g.get2()));
		
		System.out.println();
		
		Generic<Double> g2 = new Generic<Double>(20.5,10.5);
		
		System.out.println("x=" + g2.get1() + ", b=" + g2.get2());
		System.out.println(
				"사칙연산 결과 : " + g2.Add(g2.get1(), g2.get2()) +
				", " + g.Sub(g2.get1(), g2.get2()) +
				", " + g.Mul(g2.get1(), g2.get2()) +
				", " + g.Div(g2.get1(), g2.get2()));
	}
}