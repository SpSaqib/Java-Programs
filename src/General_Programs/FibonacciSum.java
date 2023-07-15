package General_Programs;

public class FibonacciSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=1;
		
		int sum=0;
		int temp=0;
		System.out.print(n1+ " "+n2 );
		 
		for(int i=0; i<10;i++)
		{
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
			
		}
		
	}

}
