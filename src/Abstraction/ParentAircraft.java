package Abstraction;

public abstract class ParentAircraft {
	
	public void engineGuidelines()
	{
		System.out.println("Follow Engine Guidelines from Parent");
	}
	
	public void safetyGuidelines()
	{
		System.out.println("Follow Safety Guidelines from Parent");
	}

	public abstract void bodyColor();
}
