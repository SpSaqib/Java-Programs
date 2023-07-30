package General_Programs;

import java.util.Scanner;

public class IsNumberArmstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int cube=0;
		int armStrong=0;
		while(num>0)
		{
			rem=num%10;
			cube=rem*rem*rem;
			armStrong=armStrong+cube;
			
			
			num=num/10;
		}
			if(armStrong==temp)
		{
		System.out.println("number is Armsrong : "+armStrong);
		}
		else
		{
			System.out.println("number is not Armsrong : "+armStrong);
		}
		
	}
	

}
