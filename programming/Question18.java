package programming;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		//to print all multiples of a and b till n
		for(int i=1;i<=n;i++)
		{
			if(i%a==0|| i%b==0)//for get multiples of the number which is multiple of both use "AND" operator
			{
				System.out.println(i);
			}
		}

	}

}
