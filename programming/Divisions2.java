package programming;

import java.util.Scanner;

public class Divisions2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if((n-7)%10==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
