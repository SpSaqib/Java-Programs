package General_Programs;

import java.util.Scanner;

public class EvenOddDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("Given number is : "+a);
		
		int evenCount=0;
		int oddCount=0;
		int rem=0;
		
		while(a>0)
		{
			rem=a%10;
			if(a%2==0) 
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			a=a/10;
		}
		System.out.println("Even Digits in the Number : "+evenCount);
		System.out.println("Odd Digits in the Number : "+oddCount);
	}

}
