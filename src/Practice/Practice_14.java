package Practice;
import Practice.Car14;

public class Practice_14 {
	public void practice14()
	{
		Car14 car = new Car14("Benz");
		
		car.Start();
		System.out.println("���۽� �ӵ� : "+car.Speed());
		car.Accelerate();
		System.out.println("���� 1�ܰ� �ӵ� : " + car.Speed());
		car.Accelerate();
		System.out.println("���� 2�ܰ� �ӵ� : " + car.Speed());
		car.Accelerate();
		System.out.println("���� 3�ܰ� �ӵ� : " + car.Speed());
		car.Break();
		System.out.println("���� 2�ܰ� �ӵ� : " + car.Speed());
		car.Break();
		System.out.println("���� 1�ܰ� �ӵ� : " + car.Speed());
		car.Stop();
		System.out.println("���� �� �ӵ� : " + car.Speed());
	}
}
