package in.atish.beans;

public class Car {
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Car Constructor Called..");
	}
	
	public void setEngine(IEngine eng)
	{
		this.eng=eng;
	}
	public void drive()
	{
		boolean status=eng.start();
		
		if(status)
			System.out.println("Journey Begines...");
		else
			System.out.println("Engine Starting Problem ");
	}

}
