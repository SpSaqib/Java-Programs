package General_Programs;

import java.util.Scanner;

public class NumberFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Given Number is : "+num);
		long factorial=1;
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}

}
