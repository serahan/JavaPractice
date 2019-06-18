package Practice;
import Practice.FulltimeEmployee;
import Practice.ParttimeEmployee;

public class Practice_16 {
	public void practice16()
	{
		FulltimeEmployee full = new FulltimeEmployee("Park");
		System.out.print("ÇöÀç ¿¬ºÀ : ");
		System.out.println(full.getAnnualSalary());
		
		System.out.print("¿¬ºÀ ÀÎ»ó : ");
		full.AdjustSalary();
		System.out.println(full.getAnnualSalary());
		
		ParttimeEmployee part = new ParttimeEmployee("Jeong");
		System.out.print("±Ý¾× : ");
		part.CalculatePay(8);
		System.out.println(part.getTimelySalary());
	}
}
