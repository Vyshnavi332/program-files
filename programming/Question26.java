package programming;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// To print all multiples of x till n
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=scan.nextInt();
		for(int i=n;i<=x;i++)
		{
			if(i%n==0)
			{
				System.out.print(i + " ");
			}
		}

	}

}
