package programming;

import java.util.Scanner;

public class questin12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=65 && n<=90)
		{
			System.out.println("Uppercase" +" " + (char)n);
			
		}
		else if(n>=97 && n<=122) 
		{
			System.out.println("Lowercase"+" "+ (char)n);
		}
		else if(n>=48 && n<=57)
		{
			System.out.println("Numeric" + " "+(char)n);
		}
		else
		{
			System.out.println("noA" +" "+ (char)n);
		}
	}

}
