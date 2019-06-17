package Practice;
import Practice.Car14;

public class Practice_14 {
	public void practice14()
	{
		Car14 car = new Car14("Benz");
		
		car.Start();
		System.out.println("½ÃÀÛ½Ã ¼Óµµ : "+car.Speed());
		car.Accelerate();
		System.out.println("¿¢¼¿ 1´Ü°è ¼Óµµ : " + car.Speed());
		car.Accelerate();
		System.out.println("¿¢¼¿ 2´Ü°è ¼Óµµ : " + car.Speed());
		car.Accelerate();
		System.out.println("¿¢¼¿ 3´Ü°è ¼Óµµ : " + car.Speed());
		car.Break();
		System.out.println("¿¢¼¿ 2´Ü°è ¼Óµµ : " + car.Speed());
		car.Break();
		System.out.println("¿¢¼¿ 1´Ü°è ¼Óµµ : " + car.Speed());
		car.Stop();
		System.out.println("Á¤Áö ÈÄ ¼Óµµ : " + car.Speed());
	}
}
