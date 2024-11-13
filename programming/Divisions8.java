package programming;

import java.util.Scanner;

public class Divisions8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=65 && n<=90)
		{
			System.out.println("Yes");
			System.out.println((char)n);
		}
		else
		{
			System.out.println("No");
		}
	}

}
