package String_Programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		String s1="shdfuua@435674$$&535%#$@#&";
		
		String removeSpecialCharactersS1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(removeSpecialCharactersS1);
		
		
		//Second Approach only of Capital and Smaller letters
		String s2="xndjhkj@$$*#ADKDKJDJD^#%jdjduhuh)*^%62893663";
		String removeSpecialCharactersS2="";
		
		 for (int i = 0 ; i<s2.length(); i++)
		 {
		 if(s2.charAt(i)>=65 && s2.charAt(i)<= 90 || s2.charAt(i)>= 97 && s2.charAt(i)<=122 ) {
		 
			 removeSpecialCharactersS2 = removeSpecialCharactersS2 + s2.charAt(i);
		 
		 }
		 }
		 System.out.println(removeSpecialCharactersS2);
		
		
	}

}
