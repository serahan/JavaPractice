package Practice;
import Practice.FulltimeEmployee;
import Practice.ParttimeEmployee;

public class Practice_16 {
	public void practice16()
	{
		FulltimeEmployee full = new FulltimeEmployee("Park");
		System.out.print("���� ���� : ");
		System.out.println(full.getAnnualSalary());
		
		System.out.print("���� �λ� : ");
		full.AdjustSalary();
		System.out.println(full.getAnnualSalary());
		
		ParttimeEmployee part = new ParttimeEmployee("Jeong");
		System.out.print("�ݾ� : ");
		part.CalculatePay(8);
		System.out.println(part.getTimelySalary());
	}
}
