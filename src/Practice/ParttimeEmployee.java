package Practice;

public class ParttimeEmployee extends Employee16 {
	private int TimelySalary=0;
	
	public ParttimeEmployee(String str)
	{
		setName(str);
	}
	
	public void CalculatePay(int time)
	{
		this.TimelySalary = 8350 * time;
	}
	
	public int getTimelySalary()
	{
		return TimelySalary;
	}
}
