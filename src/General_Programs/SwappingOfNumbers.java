package General_Programs;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("Value of a and b before swapping " +a+" and "+b);
		
		//With using third variable
//		int t;
//		t=a;
//		a=b;
//		b=t;
//    	System.out.println("Value of a and b after swapping " +a+" and "+b);
//		
		//With using + and - without using third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("Value of a and b after swapping " +a+" and "+b);
		
		//With using * and / without using third variable
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("Value of a and b after swapping " +a+" and "+b);
		
		b=a+b-(a=b);
		System.out.println("Value of a and b after swapping " +a+" and "+b);

	}

}
