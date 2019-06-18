package Practice;

public class FulltimeEmployee extends Employee16 {
	private int AnnualSalary=90000;
	
	public FulltimeEmployee(String str)
	{
		setName(str);
	}
	
	public void AdjustSalary()
	{
		this.AnnualSalary+=10000;
	}
	
	public int getAnnualSalary()
	{
		return AnnualSalary;
	}
}
