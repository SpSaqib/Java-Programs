package General_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Number is : "+num);
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Number is prime : "+num);
			}
			else
			{
				System.out.println("Number is not prime : "+num);
			}
		}
		else
		{
			System.out.println("Number is not prime : "+num);
		}

	}

}
