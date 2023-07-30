package String_Programs;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		
		String s="Java is the best langauge among all the langauges";
		
		int total_Number_Of_Counts=s.length();
		
		String after_Removing_Character_From_Original_String=s.replaceAll("a", "");
		
		int counts_after_removingCounts=after_Removing_Character_From_Original_String.length();

		int No_of_occtrence=total_Number_Of_Counts-counts_after_removingCounts;
		System.out.println(No_of_occtrence);
		
		//Second Approach
		
		String s2="Java is the best langauge among all the langauges";
		int count=0;
		
		for(int i=0;i<s2.length();i++)
		{
			if('a'==s2.charAt(i))
			{
				count++;
			}
			
		}
		
		System.out.println("No of occurence : "+count);
	}


}
