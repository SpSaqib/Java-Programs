package General_Programs;

import java.util.Scanner;

public class DigitsSumInNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		System.out.println("Given number is : "+num);
		
		
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}

		System.out.println("Sum of the Digits in the Number is : "+sum);
	}

}
