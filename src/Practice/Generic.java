package Practice;

public class Generic<T extends Number> {
	public T num1;
	public T num2;
	
	public Generic(T a,T b)
	{
		this.num1=a;
		this.num2=b;
	}
	
	public T get1()
	{
		return num1;
	}
	public T get2()
	{
		return num2;
	}
	
	@SuppressWarnings("hiding")
	public <T extends Number> double Add (T a, T b)
	{
		return a.doubleValue() + b.doubleValue();
	}
	@SuppressWarnings("hiding")
	public <T extends Number> double Sub (T a, T b)
	{
		return a.doubleValue() - b.doubleValue();
	}
	@SuppressWarnings("hiding")
	public <T extends Number> double Mul (T a, T b)
	{
		return a.doubleValue() * b.doubleValue();
	}
	@SuppressWarnings("hiding")
	public <T extends Number> double Div (T a, T b)
	{
		return a.doubleValue() / b.doubleValue();
	}
}
