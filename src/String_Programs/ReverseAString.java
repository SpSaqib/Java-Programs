package String_Programs;

public class ReverseAString {
	public static void main(String[] args) 
	{
		
		stringCheck("MADAM");
}
		
		
			
		public static void stringCheck(String name)
		{
		
		
		System.out.println(name);
		
		String rev="";
//		
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			rev=rev+name.charAt(i);
//		}
		
		// using character array
		
//		char a[]=name.toCharArray();
//		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			rev=rev+a[i];
//			
//		}
//		
		// using String buffer
		
		StringBuffer sb=new StringBuffer(name);
		
		
		System.out.println("Reverse a String : "+sb.reverse());
		
		if (rev.equals(name))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
		
	}
	

}
