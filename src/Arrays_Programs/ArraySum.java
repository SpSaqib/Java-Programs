package Arrays_Programs;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] a= {2,3,90,4,5,7};
		int sum=0;
		int count=a.length;
		
		for(int i=0;i<count;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
