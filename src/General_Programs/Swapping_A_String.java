package General_Programs;

public class Swapping_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Saqib";
		String str2="Pendhara";
		
		int n=str1.length();
		
		System.out.println(str1);
		System.out.println(str2);

		 str1=str1+str2;
		
		str2=str1.substring(0,n );
		str1=str1.substring(n);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
