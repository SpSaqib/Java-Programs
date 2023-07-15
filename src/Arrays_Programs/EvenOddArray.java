package Arrays_Programs;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int[] a= {2,3,90,4,5,7};
		
		int count=a.length;
		System.out.println("Even numbers in the array: ");
		for(int i=0;i<count;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(" " +a[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Odd numbers in the array: ");
		for(int i=0;i<count;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(" "+a[i]);
			}
		}
		
	}

}
