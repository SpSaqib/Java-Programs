package Inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		
		GrandParent gp=new Child();
		gp.ocean();
		((Child) gp).sea();
		
	}
	public void ocean()
	{
		System.out.println("There are 7 ocean from Child");
	}
	public void sea()
	{
		System.out.println("India having bay of bengal as Sea from Child");
	}
	public void river()
	{
		System.out.println("Main river of India is Ganga");
	}

}
