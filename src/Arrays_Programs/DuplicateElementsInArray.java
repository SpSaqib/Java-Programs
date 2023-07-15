package Arrays_Programs;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,5,5,6,7,5,6,9,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Elements In Array : "+a[i]);
					
				}
				
			}
		}

	}

}
