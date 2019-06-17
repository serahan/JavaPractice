package Practice;

public class Car14 
{
	private String name;
	private String maker;
	private String model;
	private int speed;

	public Car14(String str) 
	{
		this.name = str;
	}

	public String getMaker() 
	{
		return maker;
	}

	public void setMaker(String str) 
	{
		this.maker = str;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String str) 
	{
		this.model = str;
	}

	public int Speed() 
	{
		return speed;
	}

	public void Start() 
	{
		this.speed = 1;
	}

	public void Stop() 
	{
		this.speed = 0;
	}

	public void Accelerate() 
	{
		this.speed += 10;
	}

	public void Break() 
	{
		this.speed -= 10;
	}
}
