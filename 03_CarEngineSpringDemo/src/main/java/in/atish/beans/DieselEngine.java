package in.atish.beans;

public class DieselEngine implements IEngine {

	public DieselEngine()
	{
		System.out.println("Diesel Engine Constructor Called...");
	}
	
	@Override
	public boolean start() {
		System.out.println("Diesel Engine Started....");
		return true;
	}
}
