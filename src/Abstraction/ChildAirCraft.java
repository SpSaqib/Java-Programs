package Abstraction;

public class ChildAirCraft extends ParentAircraft {

	public static void main(String[] args) {
		
		ChildAirCraft ca=new ChildAirCraft();
		ca.engineGuidelines();
		ca.safetyGuidelines();
		ca.bodyColor();
		

		ParentAircraft pa=new ChildAirCraft();
		pa.engineGuidelines();
		pa.safetyGuidelines();
		pa.bodyColor();
		
	}
	
	public void engineGuidelines()
	{
		System.out.println("Follow Engine Guidelines from Child");
	}
	
	public void safetyGuidelines()
	{
		System.out.println("Follow Safety Guidelines from Child");
	}

	@Override
	public void bodyColor() 
	{
		System.out.println("Colour is red");
		
	}

}
