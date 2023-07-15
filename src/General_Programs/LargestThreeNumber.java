package General_Programs;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of B : ");
		int b=sc.nextInt();
		
		System.out.println("Enter the value of C : ");
		int c=sc.nextInt();
		
		int largest=0;
		
		if(a>b && a>c)
		{
			largest=a;
		}

		else if(b>a && b>c)
		{
			largest=b;
		}
		else
		{
			largest=c;
		}
		
		System.out.println("Largest of 3 numbers is : "+largest);
		
	}

}
