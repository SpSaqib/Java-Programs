package Arrays_Programs;

public class MaximumMinimumInArray {

	public static void main(String[] args) {
		
		int[] a= {22,33,4,1000,5,720,60,70,890};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];	
			}
		}
		System.out.println("Minimum number is in an Array is : "+max);

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];	
			}
		}
		System.out.println("Minimum number is in an Array is : "+min);
	}

}
