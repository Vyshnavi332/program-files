package programming;

import java.util.Scanner;

public class Question25 {
		public static void main(String[] args) {
			 Scanner scan=new Scanner(System.in);
			 int n=scan.nextInt();
			 printPrimes(n);
			}

		static void printPrimes(int n)
		{
			int count=0;
			for(int i=2;count<n;i++)
			{
				if(checkPrime(i))
				{
					System.out.println(i);
					count++;
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
