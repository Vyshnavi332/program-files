package programming;

import java.util.Scanner;

public class Question22 {
	//print number of factors
	//public static void countFactors(int n)
	public static int  countFactors(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
		//System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//countFactors(n);
		System.out.println(countFactors(n));
	}

}
