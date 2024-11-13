package programming;

import java.util.Scanner;

public class questin13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<0 || n>100)
		{
			System.out.println("Invalid");
		}
		else if(n>91)
		{
			System.out.println("A+");
		}
		else if(n>81)
		{
			System.out.println("A");
		}
		else if(n>71)
		{
			System.out.println("B+");
		}
		else if(n>61)
		{
			System.out.println("B");
		}
		else if(n>51)
		{
			System.out.println("C+");
		}
		else if(n>35)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
