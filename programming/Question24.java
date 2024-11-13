package programming;

import java.util.Scanner;

public class Question24 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int n1=scan.nextInt();
		 int n2=scan.nextInt();
		 printPrimes(n1,n2);
		}

	static void printPrimes(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	 static boolean checkPrime(int num)
		{
			if(num<=1)
			{
			return false;
			}
			
			for(int j=2;j*j<=num;j++)
			{
				if(num%j==0)
				{
					return false;
				}
			}
					return true;
			}
		
			}


