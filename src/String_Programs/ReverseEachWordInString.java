package String_Programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s="Java is the best Language in the world";
		
		String[] words=s.split("\\s");
		
		String reverseStatement="";
		
		for(String word:words)
		{
			String reverseword="";
			
			for (int i=word.length()-1;i>=0;i--)
			{
				reverseword=reverseword+word.charAt(i);
			}
			reverseStatement=reverseStatement+reverseword+" ";
		}
		
		System.out.println("Reverse Each Word In String : "+reverseStatement);

	}

}
