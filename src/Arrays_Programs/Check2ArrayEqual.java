package Arrays_Programs;

public class Check2ArrayEqual {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,6,90};
		int countA=a.length;
		
		int[] b= {1,2,4,5,6,90};
		int countB=b.length;
		
		boolean arrayEquals=true;
		if(countA==countB)
		{
			for(int i=0;i<countA;i++)
			{
				if (a[i]!=b[i])
				{
				//	System.out.println("Both arrays are equal");
					arrayEquals= false;
					break;
				}
				else
				{
//					System.out.println("Arrays are not equal");
				}
			}
		}
		else
		{
			arrayEquals= false;
	//		System.out.println("Arrays are not equal");
		}
		if (arrayEquals) 
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}

	}

}
