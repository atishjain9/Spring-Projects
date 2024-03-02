package in.atish.beans;

public class PetrolEngine implements IEngine{

	public PetrolEngine()
	{
		System.out.println("Petrol Engine Constructor Called...");
	}
	@Override
	public boolean start() {
		System.out.println("Petrol Engine Started...");
		return true;
	}

}
