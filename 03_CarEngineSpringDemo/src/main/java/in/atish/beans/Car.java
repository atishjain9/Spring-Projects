package in.atish.beans;

public class Car {
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Car Constructor Called..");
	}
	
	public void setEng(IEngine eng)
	{
		System.out.println("Setter method is called...");
		this.eng=eng;
		System.out.println("Injected..:"+eng.getClass().getName());
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
